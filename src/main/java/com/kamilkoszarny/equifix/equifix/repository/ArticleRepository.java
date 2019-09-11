package com.kamilkoszarny.equifix.equifix.repository;

import com.kamilkoszarny.equifix.equifix.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {


}
