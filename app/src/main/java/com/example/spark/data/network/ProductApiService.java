package com.example.spark.data.network;

import com.example.spark.data.entity.Product;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductApiService {
    @GET("/api/products")
    Call<CategoriesResponse> getProducts();
}
