package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="divisions")
@Getter
@Setter
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="division_id")
    private Long id;

    @Column(name= "division")
    private String division_name;

    @Column(name="create_date")
    private Date create_date;

    @Column(name= "last_update")
    private Date last_update;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false, insertable = false, updatable = false)
    private Country country;

    @OneToMany(mappedBy = "division_id", cascade = CascadeType.ALL)
    private Set<Customer> customers;

    @Column(name= "country_id")
    private Long country_id;
    public void setCountry(Country country) {

        setCountry_id(country.getId());
        this.country = country;

    }


}
