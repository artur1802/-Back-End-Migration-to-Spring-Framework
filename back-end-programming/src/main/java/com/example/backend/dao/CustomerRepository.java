package com.example.backend.dao;

import com.example.backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*") // "*" allows requests from any origin.
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByFirstNameAndLastName(String firstName, String lastName);
}
