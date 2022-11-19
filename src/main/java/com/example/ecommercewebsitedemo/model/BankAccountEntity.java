package com.example.ecommercewebsitedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "bank_accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankAccountEntity {
    @Id
    private int id;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "owner")
    private String owner;

}
