package com.example.starts.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Frank Kirby", "email@gmail.com","password123"),
                new Customer(2L,"Alan Pardew", "email@gmail.com","123password")
        );
    }
}
