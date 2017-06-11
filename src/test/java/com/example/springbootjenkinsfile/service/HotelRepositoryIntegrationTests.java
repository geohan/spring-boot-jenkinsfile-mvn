package com.example.springbootjenkinsfile.service;

import com.example.springbootjenkinsfile.DemoApplicationTests;
import com.example.springbootjenkinsfile.domain.City;
import com.example.springbootjenkinsfile.domain.Hotel;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ravipalakodeti on 6/10/17.
 */
public class HotelRepositoryIntegrationTests extends DemoApplicationTests {

    @Autowired
    HotelRepository repository;
    @Autowired
    CityRepository cityRepository;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("=== Hotel setup ===");
    }


    @Test
    public void findsFirstPageOfCities() {
        System.out.println("=== hotal findsFirstPageOfCities ===");
        Page<Hotel> hotels = this.repository.findAll(new PageRequest(0, 10));
        assertThat(hotels.getTotalElements()).isGreaterThan(20L);
    }

    @Test
    public void findByCity() {
        System.out.println("=== hotal findByCity ===");
        City city = cityRepository.findByNameAndCountryAllIgnoringCase("Melbourne",
                "Australia");
        Hotel hotel = this.repository.findByCity(city);
        assertThat(hotel).isNotNull();
        assertThat(hotel.getName()).isEqualTo("The Langham");
    }


}
