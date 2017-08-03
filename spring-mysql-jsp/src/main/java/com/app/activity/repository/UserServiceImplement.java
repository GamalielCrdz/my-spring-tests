package com.app.activity.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.activity.entity.User;

@Service
public class UserServiceImplement implements UserServices  {

	@Autowired
	UserRepos userRepos;
	
	@Override
	public Iterable<User> allUsers() {
		// TODO Auto-generated method stub
		return userRepos.findAll();
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepos.findOne(id);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepos.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepos.delete(id);
	}

}
