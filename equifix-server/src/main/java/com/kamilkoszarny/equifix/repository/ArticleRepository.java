package com.kamilkoszarny.equifix.repository;

        import com.kamilkoszarny.equifix.model.Article;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {


}

