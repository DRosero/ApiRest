package com.crudapi.apirest.controller;

import com.crudapi.apirest.model.UserModel;
import com.crudapi.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/listarUsuarios")
    public List<UserModel> listarTodosUsuarios(){
        return userService.listarTodosUsuarios();
    }

    @GetMapping(path="/{id}")
    public Optional<UserModel> listarUsuarioporID(@PathVariable("id") Long id){
        return userService.listarUsuarioporID(id);
    }

    @PostMapping
    public UserModel guardarUsuario(@RequestBody UserModel user){
        return userService.guardarUser(user);
    }

    /*@PutMapping(path="/{id}")
    public UserModel actualizarUsuarioporID(@RequestBody UserModel userModelActualizar, @PathVariable("id") Long id ){
        return userService.actualizarUsuarioporId(userModelActualizar,id);
    }*/

    @PutMapping(path="/{id}")
    public void actualizarUsuarioporID(@RequestBody UserModel userModelActualizar, @PathVariable("id") Long id ){
        userService.actualizarUsuarioporId(userModelActualizar,id);
    }

    @DeleteMapping(path="/{id}")
    public void borrarUsuarioporId(@PathVariable("id") Long id){
        boolean usuarioBorrado= userService.borrarUsuario(id);
        if(usuarioBorrado){
            System.out.println("El usuario fue borrado exitosamente");
        }
        else {
            System.out.println("El usuario no fue borrado");
        }
    }
}
