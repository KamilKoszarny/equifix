import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ArticlesListComponent} from "./articles-list/articles-list.component";
import {AddArticleComponent} from "./add-article/add-article.component";
import {AddCategoryComponent} from "./add-category/add-category.component";
import {LoginComponent} from "./login/login.component";


const routes: Routes = [
  {path: 'articles', component: ArticlesListComponent},
  {path: 'add-article', component: AddArticleComponent},
  {path: 'add-category', component: AddCategoryComponent},
  {path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
