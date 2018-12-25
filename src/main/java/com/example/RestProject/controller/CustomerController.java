package com.example.RestProject.controller;

import com.example.RestProject.entity.Customer;
import com.example.RestProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/all")
    public String getAllCustomers (Model model){
        List<Customer> customerList = customerService.getAll();
        model.addAttribute("customerList",customerList);
        return "customer-list";
    }
}
