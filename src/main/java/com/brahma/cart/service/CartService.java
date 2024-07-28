package com.brahma.cart.service;

import com.brahma.cart.bean.Cart;
import com.brahma.cart.bean.Product;
import com.brahma.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository repository;
    public Mono<Cart> getCustomerCart(Product product) {

        return  Mono.just(repository.findById(product.getProductId()).get());

    }

}
