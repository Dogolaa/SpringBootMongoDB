package com.lucasdogo.SpringBootMongo.services;

import com.lucasdogo.SpringBootMongo.domain.Post;
import com.lucasdogo.SpringBootMongo.repository.PostRepository;
import com.lucasdogo.SpringBootMongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;
    
    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
