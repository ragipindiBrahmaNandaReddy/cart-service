package com.brahma.cart.config;

import com.brahma.cart.handler.CartHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CartConfiguration {

    private final CartHandler handler;

    public CartConfiguration(final CartHandler handler){
        this.handler=handler;
    }


    public RouterFunction<ServerResponse> cartRoutes(){
        return route(POST(""),handler::createCart);
    }
}
