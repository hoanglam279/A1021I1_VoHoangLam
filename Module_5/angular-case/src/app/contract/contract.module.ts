import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ContractRoutingModule } from './contract-routing.module';
import {ContractEditComponent} from './contract-edit/contract-edit.component';
import {ContractCreateComponent} from './contract-create/contract-create.component';
import {ContractComponent} from './contract.component';
import {ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [ContractComponent,
    ContractCreateComponent,
    ContractEditComponent
  ],
  imports: [
    CommonModule,
    ContractRoutingModule,
    ReactiveFormsModule
  ]
})
export class ContractModule { }
