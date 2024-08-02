package com.example.backend.dto;

import com.example.backend.entities.Cart;
import com.example.backend.entities.CartItem;
import com.example.backend.entities.Customer;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;

}
