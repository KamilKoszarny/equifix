import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ArticlesListComponent} from "./articles-list/articles-list.component";
import {AddArticleComponent} from "./add-article/add-article.component";
import {AddCategoryComponent} from "./add-category/add-category.component";


const routes: Routes = [
  {path: 'articles', component: ArticlesListComponent},
  {path: 'add-article', component: AddArticleComponent},
  {path: 'add-category', component: AddCategoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
