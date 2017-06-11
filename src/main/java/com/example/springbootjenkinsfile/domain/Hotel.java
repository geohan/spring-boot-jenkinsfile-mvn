package com.example.springbootjenkinsfile.domain;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

/**
 * Created by ravipalakodeti on 6/10/17.
 */

@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    @NaturalId
    @Getter
    private City city;

    @Column(nullable = false)
    @NaturalId
    @Getter
    private String name;

    @Column(nullable = false)
    @Getter
    private String address;

    @Column(nullable = false)
    @Getter
    private String zip;
}
