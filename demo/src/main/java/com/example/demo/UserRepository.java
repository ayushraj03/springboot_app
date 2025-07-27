package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Optional: custom methods (like findByEmail) can go here
}
