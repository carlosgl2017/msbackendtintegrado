package com.jgarcia.springcloud.usuarios.services;

import com.jgarcia.springcloud.usuarios.models.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements  UsuarioService{
    @Override
    public List<Usuario> findAll() {
        return List.of();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
