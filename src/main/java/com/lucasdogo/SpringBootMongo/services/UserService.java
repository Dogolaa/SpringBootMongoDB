package com.lucasdogo.SpringBootMongo.services;

import com.lucasdogo.SpringBootMongo.domain.User;
import com.lucasdogo.SpringBootMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

}
