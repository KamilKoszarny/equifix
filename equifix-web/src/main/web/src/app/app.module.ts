import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ArticlesListComponent } from './articles-list/articles-list.component';
import {ArticleService} from "./service/article.service";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { AddArticleComponent } from './add-article/add-article.component';
import { AddCategoryComponent } from './add-category/add-category.component';
import {CategoryService} from "./service/category.service";
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    ArticlesListComponent,
    AddArticleComponent,
    AddCategoryComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ArticleService, CategoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
