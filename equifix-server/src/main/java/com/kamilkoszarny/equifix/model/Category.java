package com.kamilkoszarny.equifix.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "category_name")
    private String name;
}
