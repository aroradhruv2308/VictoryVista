package com.example.victoryvista.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
public class Folder {

    private String id;

    public Folder(String id) {
        this.id = id;
    }
}
