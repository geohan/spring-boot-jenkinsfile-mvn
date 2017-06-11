package com.example.springbootjenkinsfile.service;

import com.example.springbootjenkinsfile.domain.City;
import com.example.springbootjenkinsfile.domain.Hotel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ravipalakodeti on 6/10/17.
 */

@RepositoryRestResource(collectionResourceRel = "hotels", path = "hotels")
interface HotelRepository extends PagingAndSortingRepository<Hotel, Long> {

    Hotel findByCity(City city);

}