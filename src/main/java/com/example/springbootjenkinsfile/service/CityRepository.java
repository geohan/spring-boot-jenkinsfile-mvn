package com.example.springbootjenkinsfile.service;

import com.example.springbootjenkinsfile.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ravipalakodeti on 6/10/17.
 */

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
interface CityRepository extends PagingAndSortingRepository<City, Long> {

    Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(
            @Param("name") String name, @Param("country") String country,
            Pageable pageable);

    City findByNameAndCountryAllIgnoringCase(@Param("name") String name,
                                             @Param("country") String country);

}