package com.example.spark.data.network;

import com.example.spark.data.entity.Category;
import java.util.List;

public class CategoriesResponse {
    private List<Category> data;
    private String message;
    private boolean success;

    public List<Category> getData() {
        return data;
    }
    public void setData(List<Category> data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
