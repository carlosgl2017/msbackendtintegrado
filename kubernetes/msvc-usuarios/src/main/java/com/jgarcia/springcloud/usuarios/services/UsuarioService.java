package com.jgarcia.springcloud.usuarios.services;

import com.jgarcia.springcloud.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    void  deleteById(Long id);
}
