package com.example.victoryvista.repository;

import com.example.victoryvista.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
