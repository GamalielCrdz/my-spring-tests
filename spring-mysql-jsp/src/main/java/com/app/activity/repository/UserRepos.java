package com.app.activity.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import com.app.activity.entity.*;

@Transactional
public interface UserRepos extends 	CrudRepository<User, Long>  {

}
