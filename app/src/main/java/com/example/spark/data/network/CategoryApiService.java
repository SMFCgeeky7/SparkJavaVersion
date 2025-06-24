package com.example.spark.data.network;

import com.example.spark.data.entity.Category;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CategoryApiService {
    @GET("/api/categories")
    Call<CategoriesResponse> getCategories();
}
