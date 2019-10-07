import { Component, OnInit } from '@angular/core';
import {Category} from "../model/category";
import {CategoryService} from "../service/category.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent {

  category: Category;

  constructor(private categoryService: CategoryService, private router: Router) {
    this.category = new Category();
  }

  onSubmit() {
    this.categoryService.addCategory(this.category).subscribe();
  }

  goToCategoriesList() {
    this.router.navigate(['/categories']);
  }

}
