package com.brahma.cart.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor@AllArgsConstructor
@Entity(name="rr_product")
public class Product {

    @Id
    private long productId;
    private String productName;
    private String productDescription;
    private long productQuantity;
    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private Cart cart;
    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "id")
    private Customer customer;
}
