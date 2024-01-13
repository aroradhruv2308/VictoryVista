package com.example.victoryvista.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document("projects")
public class Project {
    @Id
    private String id;

    private String name;
    private List<Folder> folders;
    private List<Task> tasks;

    public Project(String id, String name, List<Folder> folders, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.folders = folders;
        this.tasks = tasks;
    }
}
