package com.example.demorestapi.Controller;

import com.example.demorestapi.Model.Customer;
import com.example.demorestapi.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity registerCustomer(@RequestBody Customer customer) {
        return customerService.registerCustomer(customer);
    }
}
