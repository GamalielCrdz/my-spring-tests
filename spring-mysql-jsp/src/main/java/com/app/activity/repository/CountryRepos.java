package com.app.activity.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.app.activity.entity.Country;

@Transactional
public interface CountryRepos extends CrudRepository<Country, Long>{
	

}
