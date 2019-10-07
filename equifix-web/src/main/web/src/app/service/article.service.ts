import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Article} from '../model/article';
import {Observable} from "rxjs";

@Injectable()
export class ArticleService {

  private readonly articlesUrl: string;

  constructor(private http: HttpClient) {
    this.articlesUrl = 'http://localhost:8092/equifixserver_war/articles';
  }

  public findAll(): Observable<Article[]> {
    return this.http.get<Article[]>(this.articlesUrl);
  }

  public addArticle(article: Article) {
    return this.http.post<Article>(this.articlesUrl, article);
  }
}
