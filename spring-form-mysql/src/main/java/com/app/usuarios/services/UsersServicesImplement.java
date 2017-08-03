package com.app.usuarios.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.usuarios.entity.Usuarios;

@Service
public class UsersServicesImplement implements UserServices {
	
	@Autowired
	private UsuariosRepositories usuariosRepositories;

	@Override
	public Iterable<Usuarios> allUsers() {
		// TODO Auto-generated method stub
		return usuariosRepositories.findAll();
	}

	@Override
	public Usuarios findById(Integer id) {
		// TODO Auto-generated method stub
		return usuariosRepositories.findOne(id);
	}

	@Override
	public Usuarios saveUser(Usuarios user) {
		// TODO Auto-generated method stub
		
		return usuariosRepositories.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		usuariosRepositories.delete(id);
		
	}
	

}
