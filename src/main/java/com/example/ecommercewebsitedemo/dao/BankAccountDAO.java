package com.example.ecommercewebsitedemo.dao;

import com.example.ecommercewebsitedemo.model.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BankAccountDAO extends JpaRepository {
    List<BankAccountEntity> findAll();
    BankAccountEntity save(BankAccountEntity bankAccountEntity);
    void deleteById(int id);
    Optional<BankAccountEntity> findById(int id);
}
