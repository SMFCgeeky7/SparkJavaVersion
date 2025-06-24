package com.example.spark.data.network;

import com.example.spark.data.entity.Business;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface BusinessApiService {
    @GET("/api/businesses")
    Call<CategoriesResponse> getCategories();
}
