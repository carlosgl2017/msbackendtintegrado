package com.jgarcia.springcloud.usuarios.repositories;

import com.jgarcia.springcloud.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository  extends CrudRepository<Usuario, Long> {

}
