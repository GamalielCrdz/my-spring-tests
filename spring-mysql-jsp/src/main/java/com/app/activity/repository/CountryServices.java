package com.app.activity.repository;

import com.app.activity.entity.Country;

public interface CountryServices {

	Iterable<Country> allCountries();

	Country findById(Long Id);

	Country saveCountry(Country country);

	void deleteCountry(Long id);
}
