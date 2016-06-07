package br.com.cinq.spring.data.sample.service;

import java.util.List;

import br.com.cinq.spring.data.sample.entity.City;

/**
 * 
 * @author Pedro
 *
 */
public interface CityService {

	/**
	 * 
	 * @param countryName
	 * @return
	 */
	public List<City> getCities(String countryName);
}
