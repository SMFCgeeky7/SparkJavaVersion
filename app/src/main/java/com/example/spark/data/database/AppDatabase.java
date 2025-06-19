package com.example.spark.data.database;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.spark.data.dao.CategoryDao;
import com.example.spark.data.entity.Category;

import android.content.Context;

@Database(entities = {Category.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "flask_notes_db";

    // Instancia singleton
    private static AppDatabase instance;

    // DAO
    public abstract CategoryDao categoryDao();

    // Método singleton para obtener la instancia de la base de datos
    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}

