package com.example.ecommercewebsitedemo.controller;


import com.example.ecommercewebsitedemo.dao.AccountDAO;
import com.example.ecommercewebsitedemo.dao.AddressDAO;
import com.example.ecommercewebsitedemo.dao.BankAccountDAO;
import com.example.ecommercewebsitedemo.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private AccountDAO accountDAO;

    @Autowired
    private BankAccountDAO bankAccountDAO;

    @Autowired
    private AddressDAO addressDAO;

    @GetMapping("/all")
    public Object getAllCustomers() {
        return customerDAO.findAll();
    }

    @GetMapping("/all/accounts")
    public Object getAllAccounts() {
        return accountDAO.findAll();
    }


}
