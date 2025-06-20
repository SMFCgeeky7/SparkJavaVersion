package com.example.spark.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spark.data.entity.Business;

import java.util.List;

/**
 * Data Access Object para la entidad Business
 */
@Dao
public interface BusinessDao {

    @Query("SELECT * FROM Business ORDER BY businessId ASC")
    List<Business> getAllBusiness();

    @Query("SELECT * FROM Business WHERE businessId = :id")
    Business getBusinessById(int id);

    @Insert
    long insertBusiness(Business business);

    @Update
    void updateBusiness(Business business);

    @Delete
    void deleteBusiness(Business business);

    @Query("DELETE FROM Business WHERE businessId = :id")
    void deleteBusinessById(int id);
}
