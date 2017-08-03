package com.app.activity.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.activity.entity.Country;

@Service
public class CountryServicesImplemet implements CountryServices{

	@Autowired
	CountryRepos countryRepos;
	
	@Override
	public Iterable<Country> allCountries() {
		// TODO Auto-generated method stub
		return countryRepos.findAll();
	}

	@Override
	public Country findById(Long id) {
		// TODO Auto-generated method stub
		return countryRepos.findOne(id);
	}

	@Override
	public Country saveCountry(Country country) {
		// TODO Auto-generated method stub
		return countryRepos.save(country);
	}

	@Override
	public void deleteCountry(Long id) {
		// TODO Auto-generated method stub
		countryRepos.delete(id);
	}

}
