package com.brahma.cart.handler;

import com.brahma.cart.bean.Cart;
import com.brahma.cart.bean.Product;
import com.brahma.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CartHandler {

    @Autowired
    private CartService service;
    public Mono<ServerResponse> createCart(ServerRequest request) {

        return request.bodyToMono(Product.class).flatMap(product -> service.getCustomerCart(product)
                .flatMap(response -> ServerResponse.ok().body(Mono.just(response), Cart.class)));
    }
}
