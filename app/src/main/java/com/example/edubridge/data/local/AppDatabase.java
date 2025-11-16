// file: data/local/AppDatabase.java
package com.example.edubridge.data.local; // Assumes your package name

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.edubridge.data.local.dao.CourseDao;
import com.example.edubridge.data.local.entity.Course;

/**
 * The main database class for the application.
 * [cite_start]This follows the abstract class requirement from the setup guide[cite: 29].
 */
@Database(entities = {Course.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    /**
     * [cite_start]Connects the database to the Course DAO (Data Access Object)[cite: 28].
     * Room will generate the implementation for this method.
     *
     * @return The CourseDao
     */
    public abstract CourseDao courseDao();

    // You will typically add a static singleton 'getInstance()' method here
    // to control how the database is created and accessed by the rest of the app,
    // often using the Repository.
}