package com.lucasdogo.SpringBootMongo.repository;

import com.lucasdogo.SpringBootMongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
