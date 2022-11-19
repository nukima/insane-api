package com.example.ecommercewebsitedemo.dao;

import com.example.ecommercewebsitedemo.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO extends JpaRepository<CustomerEntity, Integer> {
    Optional<CustomerEntity> findAllByAccountId(int accountId);
    List<CustomerEntity> findAll();
    CustomerEntity save(CustomerEntity customerEntity);
    void deleteById(int id);
}
