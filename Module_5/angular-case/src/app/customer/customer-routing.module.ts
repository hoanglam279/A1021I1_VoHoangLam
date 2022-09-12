import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {CustomerComponent} from './customer.component';
import {CreateComponent} from './create/create.component';
import {EditComponent} from './edit/edit.component';


const routes: Routes = [
  {
    path: '',
    component: CustomerComponent
  }, {
    path: 'create',
    component: CreateComponent
  }, {
    path: 'edit/:id',
    component: EditComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }
