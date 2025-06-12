package com.jgarcia.springcloud.usuarios.controllers;

import com.jgarcia.springcloud.usuarios.models.entity.Usuario;
import com.jgarcia.springcloud.usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/")
    public List<Usuario> listar() {
        return usuarioService.findAll();
    }
    @GetMapping("/id")
    private ResponseEntity<Usuario> usuario(@PathVariable Long id) {
        Optional<Usuario> usuarioOptional = usuarioService.findById(id);
        if(usuarioOptional.isPresent()) {
            return usuarioOptional.get();
        }
        return null;
    }
}
