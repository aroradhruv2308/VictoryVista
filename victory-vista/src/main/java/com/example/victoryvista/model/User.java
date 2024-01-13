package com.example.victoryvista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document("users")
public class User {

    @MongoId
    private String id;
    private String userName;
    private String password;
    private List<ProjectReferance> projectReferancesList;

    public User(String id, String userName, String password, List<ProjectReferance> projectReferancesList) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.projectReferancesList = projectReferancesList;
    }
}