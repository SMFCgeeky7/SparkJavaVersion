package com.example.spark.viewmodels;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.spark.data.dao.CategoryDao;
import com.example.spark.data.entity.Category;
import com.example.spark.data.database.AppDatabase;
import java.util.List;

public class CategoryViewModel extends AndroidViewModel {
    private final LiveData<List<Category>> categories;

    public CategoryViewModel(@NonNull Application application) {
        super(application);
        CategoryDao categoryDao = AppDatabase.getInstance(application).categoryDao();
        categories = categoryDao.getAllCategoriesLive();
    }

    public LiveData<List<Category>> getCategories() {
        return categories;
    }
}

