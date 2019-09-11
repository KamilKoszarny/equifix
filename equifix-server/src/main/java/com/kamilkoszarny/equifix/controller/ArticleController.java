package com.kamilkoszarny.equifix.controller;

import com.kamilkoszarny.equifix.model.Article;
import com.kamilkoszarny.equifix.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> articles() {
        return articleService.getAllArticles();
    }
}
