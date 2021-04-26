package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.persistence.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final CustomerRepository customerRepository;

    @GetMapping("/customer/{customerId}")
    public Customer getCustomerById(@PathVariable Long customerId) {
        return customerRepository.findById(customerId).get();
    }

}
