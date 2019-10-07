package com.kamilkoszarny.equifix.repository;

import com.kamilkoszarny.equifix.model.Article;
import com.kamilkoszarny.equifix.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {


}

