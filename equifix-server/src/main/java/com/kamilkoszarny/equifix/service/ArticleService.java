package com.kamilkoszarny.equifix.service;

import com.kamilkoszarny.equifix.model.Article;
import com.kamilkoszarny.equifix.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        List<Article> articles = new ArrayList<>();
        articleRepository.findAll().forEach(articles::add);
        return articles;
    }

    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }
}

