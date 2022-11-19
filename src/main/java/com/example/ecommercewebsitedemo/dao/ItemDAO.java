package com.example.ecommercewebsitedemo.dao;

import com.example.ecommercewebsitedemo.model.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemDAO extends JpaRepository {
    // find all
    List<ItemEntity> findAll();
    Optional<ItemEntity> findById();
    ItemEntity save(ItemEntity itemEntity);
    void deleteById(int id);
}
