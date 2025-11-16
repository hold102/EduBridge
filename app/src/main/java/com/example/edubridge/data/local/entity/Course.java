package com.example.edubridge.data.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// file: data/local/entity/Course.java
@Entity(tableName = "courses")
public class Course {
    @PrimaryKey
    @NonNull
    public String courseId;

    public String title;
    public String description;
}
