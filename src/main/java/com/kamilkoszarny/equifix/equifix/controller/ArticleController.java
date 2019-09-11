package com.kamilkoszarny.equifix.equifix.controller;

import com.kamilkoszarny.equifix.equifix.model.Article;
import com.kamilkoszarny.equifix.equifix.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> articles() {
        return articleService.getAllArticles();
    }
}
