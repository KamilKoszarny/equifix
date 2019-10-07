import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Category} from "../model/category";

@Injectable()
export class CategoryService {

  private readonly categoriesUrl: string;

  constructor(private http: HttpClient) {
    this.categoriesUrl = 'http://localhost:8092/equifixserver_war/categories';
  }

  public findAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.categoriesUrl);
  }

  public addCategory(category: Category) {
    return this.http.post<Category>(this.categoriesUrl, category);
  }
}
