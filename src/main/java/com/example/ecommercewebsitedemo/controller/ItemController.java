package com.example.ecommercewebsitedemo.controller;


import com.example.ecommercewebsitedemo.dao.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemDAO itemDAO;

    @RequestMapping("/all")
    public Object getAllItems() {
        return itemDAO.findAll();
    }

}
