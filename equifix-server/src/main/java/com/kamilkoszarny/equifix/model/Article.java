package com.kamilkoszarny.equifix.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="article")
@Data
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;
}
