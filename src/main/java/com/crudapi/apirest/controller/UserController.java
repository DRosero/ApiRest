package com.crudapi.apirest.controller;

import com.crudapi.apirest.model.UserModel;
import com.crudapi.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/listarUsuarios")
    public List<UserModel> listarTodosUsuarios(){
        return userService.listarTodosUsuarios();
    }




}
