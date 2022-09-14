import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListProductComponent} from "../product/list-product/list-product.component";
import {ListCategoryComponent} from "./list-category/list-category.component";


const routes: Routes = [
  {
    path: '',
    component: ListCategoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CategoryRoutingModule { }
