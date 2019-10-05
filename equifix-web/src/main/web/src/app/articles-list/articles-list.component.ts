import { Component, OnInit } from '@angular/core';
import {Article} from "../model/article";
import {ArticleService} from "../service/article.service";

@Component({
  selector: 'app-articles-list',
  templateUrl: './articles-list.component.html',
  styleUrls: ['./articles-list.component.css']
})
export class ArticlesListComponent implements OnInit {

  articles: Article[];

  constructor(private articleService: ArticleService) { }

  ngOnInit() {
    this.articleService.findAll().subscribe(data => {
      this.articles = data;
    });
  }

}
