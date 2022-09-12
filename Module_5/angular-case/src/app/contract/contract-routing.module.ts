import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerComponent} from '../customer/customer.component';
import {CreateComponent} from '../customer/create/create.component';
import {EditComponent} from '../customer/edit/edit.component';
import {ContractCreateComponent} from './contract-create/contract-create.component';
import {ContractComponent} from './contract.component';
import {ContractEditComponent} from './contract-edit/contract-edit.component';


const routes: Routes = [
  {
    path: '',
    component: ContractComponent
  }, {
    path: 'create',
    component: ContractCreateComponent
  }, {
    path: 'edit/:id',
    component: ContractEditComponent
  }
];
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ContractRoutingModule { }
