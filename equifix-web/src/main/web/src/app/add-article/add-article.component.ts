import { Component } from '@angular/core';
import {Article} from "../model/article";
import {ArticleService} from "../service/article.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-article',
  templateUrl: './add-article.component.html',
  styleUrls: ['./add-article.component.css']
})
export class AddArticleComponent {

  article: Article;

  constructor(private articleService: ArticleService, private router: Router) {
    this.article = new Article();
  }

  onSubmit() {
    this.articleService.addArticle(this.article).subscribe(result => this.goToArticlesList());
  }

  goToArticlesList() {
    this.router.navigate(['/articles']);
  }
}
