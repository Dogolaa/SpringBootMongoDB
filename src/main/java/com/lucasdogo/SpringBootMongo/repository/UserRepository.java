package com.lucasdogo.SpringBootMongo.repository;

import com.lucasdogo.SpringBootMongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
