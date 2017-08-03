package com.app.activity.repository;

import com.app.activity.entity.User;

public interface UserServices {
	
	Iterable<User> allUsers();
	
	User findById(Long Id);
	
	User saveUser(User user);
	
	void deleteUser(Long id);

}
