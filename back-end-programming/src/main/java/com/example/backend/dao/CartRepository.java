package com.example.backend.dao;

import com.example.backend.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*") // "*" allows requests from any origin.
public interface CartRepository extends JpaRepository<Cart, Long> {


}
