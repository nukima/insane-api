package com.example.ecommercewebsitedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity {
    @Id
    private int id;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "address_id")
    private int addressId;

    @Column(name = "bank_account_id")
    private int bankAccountId;
}
