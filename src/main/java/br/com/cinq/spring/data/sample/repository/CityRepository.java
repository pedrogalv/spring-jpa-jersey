package br.com.cinq.spring.data.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.Country;

/**
 * City Interface Repository
 * 
 * @author Pedro
 *
 */
public interface CityRepository extends CrudRepository<City, Long> {

	public List<City> findByCountry(Country country);

	public final static String FIND_BY_COUNTRY_NAME_QUERY = "SELECT ci FROM City ci join ci.country co where co.name like %?1%";

	@Query(FIND_BY_COUNTRY_NAME_QUERY)
	public List<City> findAllByCountryNameLike(String countryName);

}
