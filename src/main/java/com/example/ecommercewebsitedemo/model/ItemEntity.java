package com.example.ecommercewebsitedemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "items")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemEntity {
    @Id
    private int id;

    @Column(name = "price")
    private int price;

    @Column(name = "name")
    private String name;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "author_id")
    private int authorId;

    @Column(name = "page_number")
    private int pageNumber;

    @Column(name = "type")
    private String type;

    @Column(name = "size")
    private String size;

    @Column(name = "discriminator")
    private String discriminator;
}
