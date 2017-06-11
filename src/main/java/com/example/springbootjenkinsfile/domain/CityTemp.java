package com.example.springbootjenkinsfile.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ravipalakodeti on 6/10/17.
 */

@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CityTemp {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @Getter
    private String name;

    @Column(nullable = false)
    @Getter
    private String state;

    @Column(nullable = false)
    @Getter
    private String country;

    @Column(nullable = false)
    @Getter
    private String map;
}
