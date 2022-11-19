package com.example.ecommercewebsitedemo.dao;

import com.example.ecommercewebsitedemo.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountDAO extends JpaRepository {
    List<AccountEntity> findAll();
    AccountEntity save(AccountEntity accountEntity);
    void deleteById(int id);
    Optional<AccountEntity> findById(int id);
}
