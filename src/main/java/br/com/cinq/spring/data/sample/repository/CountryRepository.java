package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

/**
 * Country Interface Repository
 * 
 * @author Pedro
 *
 */
public interface CountryRepository extends CrudRepository<Country, Long> {

	public List<Country> findAll();

	public List<Country> findByNameLike(String name);

}
