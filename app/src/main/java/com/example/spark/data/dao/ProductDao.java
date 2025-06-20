package com.example.spark.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spark.data.entity.Product;

import java.util.List;

/**
 * Data Access Object para la entidad Product
 */
@Dao
public interface ProductDao {

    @Query("SELECT * FROM Product ORDER BY productId ASC")
    List<Product> getAllProducts();

    @Query("SELECT * FROM Product WHERE productId = :id")
    Product getProductById(int id);

    @Insert
    long insertProduct(Product product);

    @Update
    void updateProduct(Product product);

    @Delete
    void deleteProduct(Product product);

    @Query("DELETE FROM Product WHERE productId = :id")
    void deleteProductById(int id);
}