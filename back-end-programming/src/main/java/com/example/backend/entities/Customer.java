package com.example.backend.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="customers")
//@Data-- known bug
@Setter
@Getter

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long id;

    @Column(name="customer_first_name",  nullable = false)
    private String firstName;

    @Column(name="customer_last_name",  nullable = false)
    private String lastName;

    @Column(name="address",  nullable = false)
    private String address;

    @Column(name="postal_code",  nullable = false)
    private String postal_code;


    @Column(name="phone",  nullable = false)
    private String phone;

    @Column(name="create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name="last_update")
    @UpdateTimestamp
    private Date last_update;


    @ManyToOne
    @JoinColumn(name= "division_id")
    private Division division_id;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Cart> carts = new HashSet<>();


    public Customer(String firstName, String lastName, String address, String postal_code, String phone, Division division_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postal_code = postal_code;
        this.phone = phone;
        this.division_id = division_id;
    }

    public Customer() {

    }


    public void add(Cart cart) {
        if (cart != null) {
            if (carts == null) {
                carts = new HashSet<>();
            }
            if (!carts.contains(cart)) {
                carts.add(cart);
                cart.setCustomer(this);
            }
        }
    }
}
