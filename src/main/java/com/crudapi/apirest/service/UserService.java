package com.crudapi.apirest.service;

import com.crudapi.apirest.model.UserModel;
import com.crudapi.apirest.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    public List<UserModel> listarTodosUsuarios(){
        return iUserRepository.findAll();
    }

    public Optional<UserModel> listarUsuarioporID(Long id){
        return iUserRepository.findById(id);
    }

    public void borrarUsuario(Long id){
        iUserRepository.deleteById(id);
    }


}
