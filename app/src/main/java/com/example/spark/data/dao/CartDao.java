package com.example.spark.data.dao;
import com.example.spark.data.entity.Cart;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Data Access Object para la entidad Cart
 */
@Dao
public interface CartDao {

    @Query("SELECT * FROM Cart ORDER BY cartId ASC")
    List<Cart> getAllCarts();

    @Query("SELECT * FROM Cart WHERE cartId = :id")
    Cart getCartById(int id);

    @Insert
    long insertCart(Cart cart);

    @Update
    void updateCart(Cart cart);

    @Delete
    void deleteCart(Cart cart);

    @Query("DELETE FROM Cart WHERE cartId = :id")
    void deleteCartById(int id);
}