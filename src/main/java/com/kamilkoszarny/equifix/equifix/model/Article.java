package com.kamilkoszarny.equifix.equifix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class Article {
    @Id
    @GeneratedValue
    private Long id;



    private String comment;
}