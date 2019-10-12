import {Component, OnInit} from '@angular/core';
import {Article} from "../model/article";
import {ArticleService} from "../service/article.service";
import {Router} from "@angular/router";
import {Category} from "../model/category";
import {CategoryService} from "../service/category.service";

@Component({
  selector: 'app-add-article',
  templateUrl: './add-article.component.html',
  styleUrls: ['./add-article.component.css']
})
export class AddArticleComponent implements OnInit{

  article: Article;
  categories: Category[];

  constructor(private articleService: ArticleService, private categoryService: CategoryService, private router: Router) {
    this.article = new Article();
  }

  ngOnInit(): void {
    this.categoryService.findAll().subscribe(result => {this.categories = result});
  }

  onSubmit() {
    this.articleService.addArticle(this.article).subscribe(result => this.goToArticlesList());
  }

  goToArticlesList() {
    this.router.navigate(['/articles']);
  }
}
