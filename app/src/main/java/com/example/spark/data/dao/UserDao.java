package com.example.spark.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spark.data.entity.User;

import java.util.List;

/**
 * Data Access Object para la entidad User
 */
@Dao
public interface UserDao {

    @Query("SELECT * FROM User ORDER BY userId ASC")
    List<User> getAllUsers();

    @Query("SELECT * FROM User WHERE userId = :id")
    User getUserById(int id);

    @Insert
    long insertUser(User user);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);

    @Query("DELETE FROM User WHERE userId = :id")
    void deleteUserById(int id);
}