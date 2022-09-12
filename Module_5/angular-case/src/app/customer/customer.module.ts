import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomerRoutingModule } from './customer-routing.module';
import {EditComponent} from './edit/edit.component';
import {CreateComponent} from './create/create.component';
import {CustomerComponent} from './customer.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';


@NgModule({
  declarations: [CustomerComponent,
    CreateComponent,
    EditComponent
  ],
  imports: [
    CommonModule,
    CustomerRoutingModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    FormsModule
  ]
})
export class CustomerModule { }
