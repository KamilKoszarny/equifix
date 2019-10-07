package com.kamilkoszarny.equifix.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "article")
@Data
public class Article {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String status;

    private String comment;
}
