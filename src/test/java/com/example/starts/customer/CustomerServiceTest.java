package com.example.starts.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        //given

        Customer shizzy = new Customer(
                1L,
                "Francis",
                "francis@gmail.com",
                "hello"
        );

        Customer ola = new Customer(
                2L,
                "Ola",
                "Olamide@gmail.com",
                "hello"
        );

        customerRepository.saveAll(Arrays.asList(shizzy,ola));

        //when
        List<Customer> customerList = underTest.getCustomers();

        //then
        assertEquals(2,customerList.size());
    }

    @Test
    void getCustomer() {

        //given

        Customer shizzy = new Customer(
                1L,
                "Francis",
                "francis@gmail.com",
                "hello"
        );

        customerRepository.save(shizzy);

        //when
        Customer actual = underTest.getCustomer(1L);

        //then
        assertEquals(1L,actual.getId());
        assertEquals("Francis",actual.getName());
        assertEquals("francis@gmail.com",actual.getEmail());
        assertEquals("hello",actual.getPassword());
    }
}