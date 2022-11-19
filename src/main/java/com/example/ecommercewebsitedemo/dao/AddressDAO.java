package com.example.ecommercewebsitedemo.dao;

import com.example.ecommercewebsitedemo.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressDAO extends JpaRepository {
    List<AddressEntity> findAll();
    AddressEntity save(AddressEntity addressEntity);
    void deleteById(int id);
    Optional<AddressEntity> findById(int id);
}
