package br.com.cinq.spring.data.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.repository.CityRepository;
import br.com.cinq.spring.data.sample.service.CityService;

/**
 * City service implementation
 * @author Pedro
 *
 */
@Component
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public List<City> getCities(String countryName) {
		List<City> cities = cityRepository.findAllByCountryNameLike(countryName);
		return cities;
	}

}
