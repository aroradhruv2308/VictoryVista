package com.example.victoryvista.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.MongoId;


public class ProjectReferance {
    private String projectId;
    private String role;

    public ProjectReferance(String projectId, String role) {
        this.projectId = projectId;
        this.role = role;
    }
}
