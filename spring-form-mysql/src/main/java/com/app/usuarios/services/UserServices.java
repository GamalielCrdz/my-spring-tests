package com.app.usuarios.services;

import com.app.usuarios.entity.Usuarios;

public interface UserServices {
	
	Iterable<Usuarios> allUsers();
	
	Usuarios findById(Integer Id);
	
	Usuarios saveUser(Usuarios user);
	
	void deleteUser(Integer id);

}
