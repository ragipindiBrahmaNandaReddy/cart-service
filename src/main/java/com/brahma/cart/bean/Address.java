package com.brahma.cart.bean;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="rr_address")
public class Address {
    @Id
    private long id;
    private String doorNumber;
    private String VillageName;
    private String city;
    private String pinCOde;
    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private Customer customer;
}
