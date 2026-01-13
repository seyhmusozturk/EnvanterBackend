package com.project.backend.controller;

import com.project.backend.model.User;
import com.project.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ClientController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String helloworld(){
        return "Merhaba Center Uygulaması!";
    }


    // Rest API Crud - Create User  - POST
    // Read User - GET
    // Delete User  - DELETE
    // Update User - PUT

    // create user
    @PostMapping("/add")
    public User adduser(@RequestBody User user){
     User user1 = userService.addUser(user);
        return user1;
    }

    // Read Users

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUser();
    }



    // Update Users By Id

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") long id, @RequestBody User user){ // updateuserbyıd
        return userService.updateUser(user, id);
    }


    // Delete User by Id

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id){  // updateuserbyıd
        userService.deleteUser(id);
        return "User Deleted Successfully...";
    }

    // Get User By Id

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserByid(id);
    }




}
