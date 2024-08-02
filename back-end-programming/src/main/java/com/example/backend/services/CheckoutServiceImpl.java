package com.example.backend.services;

import com.example.backend.dao.CartRepository;
import com.example.backend.dao.CustomerRepository;
import com.example.backend.dto.Purchase;
import com.example.backend.dto.PurchaseResponse;
import com.example.backend.entities.Cart;
import com.example.backend.entities.CartItem;
import com.example.backend.entities.Customer;
import com.example.backend.entities.StatusType;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private final CustomerRepository customerRepository;
    private final CartRepository cartRepository;



    public CheckoutServiceImpl(CustomerRepository customerRepository, CartRepository cartRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //retrieve the cart info from dto
        Cart cart = purchase.getCart();

        Set<CartItem> cartItems = purchase.getCartItems();

        // Check if the cartItems set is empty
        if (cartItems == null || cartItems.isEmpty()) {
            return new PurchaseResponse("Cart is empty. Please add items to the cart before placing an order.");
        }



        //generate tracking number

        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        //populate cart with cartItems
        cartItems.forEach(item -> cart.add(item));


        //populate customer with cart
        Customer customer = purchase.getCustomer();
        customer.getCarts().add(cart);


        cart.setStatus(StatusType.ordered);


        // save to the database
        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();
    }
}
