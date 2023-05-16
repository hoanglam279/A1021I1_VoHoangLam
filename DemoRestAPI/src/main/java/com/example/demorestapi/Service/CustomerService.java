package com.example.demorestapi.Service;

import com.example.demorestapi.Model.Customer;
import com.example.demorestapi.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private Customer loggedInCustomer;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ResponseEntity registerCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findByEmail(customer.getEmail());
        if (existingCustomer != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("email bi trung");
        }
        return new ResponseEntity<>(customerRepository.save(customer), HttpStatus.OK);
    }


}
