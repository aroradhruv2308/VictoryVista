package com.example.victoryvista.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


public class Task {
    private String id;

    public Task(String id) {
        this.id = id;
    }
}
