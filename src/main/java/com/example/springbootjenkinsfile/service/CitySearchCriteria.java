package com.example.springbootjenkinsfile.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * Created by ravipalakodeti on 6/10/17.
 */
public class CitySearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private String name;

    public CitySearchCriteria() {
    }

    public CitySearchCriteria(String name) {
        Assert.notNull(name, "Name must not be null");
        this.name = name;
    }

    public String getNames() {
        return this.name;
    }

    public void setNames(String name) {
        this.name = name;
    }
}
