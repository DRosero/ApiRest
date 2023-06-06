package com.crudapi.apirest.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    @Column
    private String nombre_user;

    @Column
    private String apellido_user;

    @Column
    private float telefono_user;

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_user() {
        return apellido_user;
    }

    public void setApellido_user(String apellido_user) {
        this.apellido_user = apellido_user;
    }

    public float getTelefono_user() {
        return telefono_user;
    }

    public void setTelefono_user(float telefono_user) {
        this.telefono_user = telefono_user;
    }
}
