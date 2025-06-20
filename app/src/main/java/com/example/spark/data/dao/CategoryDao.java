package com.example.spark.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spark.data.entity.Category;

import java.util.List;

/**
 * Data Access Object para la entidad Category
 */
@Dao
public interface CategoryDao {

    @Query("SELECT * FROM Category ORDER BY categoryId ASC")
    List<Category> getAllCategories();

    @Query("SELECT * FROM Category ORDER BY categoryId ASC")
    androidx.lifecycle.LiveData<java.util.List<Category>> getAllCategoriesLive();

    @Query("SELECT * FROM Category WHERE categoryId = :id")
    Category getCategoryById(int id);

    @Insert
    long insertCategory(Category category);

    @Update
    void updateCategory(Category category);

    @Delete
    void deleteCategory(Category category);

    @Query("DELETE FROM Category WHERE categoryId = :id")
    void deleteCategoryById(int id);
}