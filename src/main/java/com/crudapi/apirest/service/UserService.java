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

    public UserModel guardarUser(UserModel user){
        return iUserRepository.save(user);
    }

    public boolean borrarUsuario(Long id){
        try {
            iUserRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            System.out.println("Error al borrar user "+ e.getMessage());
            return false;
        }
    }

    /*public UserModel actualizarUsuarioporId(UserModel entidadPeticion, Long id){
        UserModel userActualizar=iUserRepository.findById(id).get();
        userActualizar.setNombre_user(entidadPeticion.getNombre_user());
        userActualizar.setApellido_user(entidadPeticion.getApellido_user());
        userActualizar.setTelefono_user(entidadPeticion.getTelefono_user());
        iUserRepository.save(userActualizar);
        return userActualizar;
    }*/

    public void actualizarUsuarioporId(UserModel entidadPeticion, Long id){
        UserModel userActualizar;
        userActualizar=entidadPeticion;
        userActualizar.setId_user(id);
        guardarUser(userActualizar);
    }
}
