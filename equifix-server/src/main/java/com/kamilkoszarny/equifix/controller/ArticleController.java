package com.kamilkoszarny.equifix.controller;

import com.kamilkoszarny.equifix.model.Article;
import com.kamilkoszarny.equifix.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/articles")
    public List<Article> articles() {
        return articleService.getAllArticles();
    }
}

