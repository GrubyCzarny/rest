package com.example.RestProject.serviceImpl;

import com.example.RestProject.entity.Customer;
import com.example.RestProject.repository.CustomerRepository;
import com.example.RestProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepo;
    @Override
    public List<Customer> getAll() {
        System.out.println("looginf for customers");
        System.out.println(customerRepo.findAll().size());
        return customerRepo.findAll();
    }
}
