package com.example.spark.data.network;

import com.example.spark.data.LoginRequest;
import com.example.spark.data.entity.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;

public interface UserApiService {
    @POST("/api/auth/login")
    @FormUrlEncoded
    Call<User> loginUser(@Field("email") String email, @Field("password") String password);
    //@POST("/api/auth/login")
    //Call<User> loginUser(@Body LoginRequest loginRequest);

    //@POST("/api/auth/login")
    //Call<User> loginUser(@Body LoginRequest loginRequest);
}
