import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ContractComponent} from '../contract/contract.component';
import {ContractCreateComponent} from '../contract/contract-create/contract-create.component';
import {ContractEditComponent} from '../contract/contract-edit/contract-edit.component';
import {FacilityComponent} from './facility.component';
import {FacilityCreateComponent} from './facility-create/facility-create.component';
import {FacilityEditComponent} from './facility-edit/facility-edit.component';


const routes: Routes = [
  {
    path: '',
    component: FacilityComponent
  }, {
    path: 'create',
    component: FacilityCreateComponent
  }, {
    path: 'edit/:id',
    component: FacilityEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FacilityRoutingModule { }
