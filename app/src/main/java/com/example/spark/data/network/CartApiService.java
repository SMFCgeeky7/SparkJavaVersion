package com.example.spark.data.network;

import com.example.spark.data.entity.Cart;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CartApiService {
    @GET("/api/carts")
    Call<CategoriesResponse> getCarts();
}
