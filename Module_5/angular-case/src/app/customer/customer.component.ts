import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../service/customer.service';
import {Customer} from '../model/customer';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customers: Customer[] = [];
  id: number;
  name: string;
  nameSearch: string;
  p = 1;
  constructor(private customerService: CustomerService,
              private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(): void {
    this.customerService.getAll().subscribe(customer => {
      this.customers = customer;
    });
  }
  openDelete(id: number, name: string): void {
    this.id = id;
    this.name = name;
  }
  delete(id: number): void {
    this.customerService.deleteCustomer(id).subscribe(() => {
      this.getAll();
      this.toast.success('xóa mới thành công', 'Thông báo');
    }, e => {
      console.log(e);
    });
  }
  search() {
    return this.customerService.searchCustomer(this.nameSearch).subscribe(listSearch => {
      console.log(listSearch);
      console.log(this.nameSearch);
      this.customers = listSearch;
      this.p = 1;
    });
  }
}
