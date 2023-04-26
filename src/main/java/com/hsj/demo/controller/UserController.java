package com.hsj.demo.controller;

import com.hsj.demo.domain.User;
import com.hsj.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserMapper userMapper;

    @PostMapping
    public Integer save(@RequestBody User user){

        return userMapper.insert(user);
    }

    @GetMapping
    public List<User> index(){
        return userMapper.findAll();
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }
}
