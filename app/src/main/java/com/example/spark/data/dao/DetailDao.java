package com.example.spark.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spark.data.entity.Detail;

import java.util.List;

/**
 * Data Access Object para la entidad Detail
 */
@Dao
public interface DetailDao {

    @Query("SELECT * FROM Detail ORDER BY detailId ASC")
    List<Detail> getAllDetails();

    @Query("SELECT * FROM Detail WHERE detailId = :id")
    Detail getDetailById(int id);

    @Insert
    long insertDetail(Detail detail);

    @Update
    void updateDetail(Detail detail);

    @Delete
    void deleteDetail(Detail detail);

    @Query("DELETE FROM Detail WHERE detailId = :id")
    void deleteDetailById(int id);
}