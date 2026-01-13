package com.project.backend.service;

import com.project.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {



    // create user
    // read users
    // delete user by id
    // uptade user

    public User addUser(User user);

    public List<User> getUser();

    public User getUserByid(long id); // long

    public User updateUser(User user, long id); // long

    public void deleteUser(long id); // long

}
