package com.example.spark.viewmodels;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.os.AsyncTask;
import android.util.Log;

import com.example.spark.data.network.ApiClient;
import com.example.spark.data.network.CategoriesResponse;
import com.example.spark.data.network.CategoryApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.example.spark.data.dao.CategoryDao;
import com.example.spark.data.entity.Category;
import com.example.spark.data.database.AppDatabase;
import java.util.List;

public class CategoryViewModel extends AndroidViewModel {
    private final LiveData<List<Category>> categories;
    private final CategoryDao categoryDao;
    private final Application app;

    public CategoryViewModel(@NonNull Application application) {
        super(application);
        this.app = application;
        categoryDao = AppDatabase.getInstance(application).categoryDao();
        categories = categoryDao.getAllCategoriesLive();
    }

    public LiveData<List<Category>> getCategories() {
        return categories;
    }

    // Llama al API y sincroniza la base local
    public void refreshCategoriesFromApi() {
        CategoryApiService apiService = ApiClient.getRetrofitInstance().create(CategoryApiService.class);
        apiService.getCategories().enqueue(new Callback<CategoriesResponse>() {
            @Override
            public void onResponse(Call<CategoriesResponse> call, Response<CategoriesResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Category> apiCategories = response.body().getData();
                    // Actualizar base local en background
                    AsyncTask.execute(() -> {
                        categoryDao.deleteAll();
                        categoryDao.insertCategories(apiCategories);
                    });
                } else {
                    Log.e("CategoryVM", "API response unsuccessful");
                }
            }

            @Override
            public void onFailure(Call<CategoriesResponse> call, Throwable t) {
                Log.e("CategoryVM", "API call failed", t);
            }
        });
    }
}


