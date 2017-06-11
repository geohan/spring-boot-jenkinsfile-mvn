package com.example.springbootjenkinsfile.service;

import com.example.springbootjenkinsfile.DemoApplicationTests;
import com.example.springbootjenkinsfile.domain.City;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ravipalakodeti on 6/10/17.
 */
public class CityRepositoryIntegrationTests extends DemoApplicationTests{

    @Autowired
    CityRepository repository;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("=== city setup ===");
    }

    @Test
    public void findsFirstPageOfCities() {
        System.out.println("=== city findsFirstPageOfCities ===");
        Page<City> cities = this.repository.findAll(new PageRequest(0, 10));
        assertThat(cities.getTotalElements()).isGreaterThan(20L);
    }

    @Test
    public void findByNameAndCountry() {
        System.out.println("=== city findByNameAndCountry ===");
        City city = this.repository.findByNameAndCountryAllIgnoringCase("Melbourne",
                "Australia");
        assertThat(city).isNotNull();
        assertThat(city.getName()).isEqualTo("Melbourne");
    }

    @Test
    public void findContaining() {
        System.out.println("=== city findContaining ===");
        Page<City> cities = this.repository
                .findByNameContainingAndCountryContainingAllIgnoringCase("", "UK",
                        new PageRequest(0, 10));
        assertThat(cities.getTotalElements()).isEqualTo(3L);
    }
}
