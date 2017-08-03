package com.app.usuarios.services;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.app.usuarios.entity.Usuarios;

@Transactional
public interface UsuariosRepositories extends CrudRepository<Usuarios, Integer> {


}
