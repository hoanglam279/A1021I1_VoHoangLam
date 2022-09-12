import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../model/customer-type';
import {CustomerService} from '../../service/customer.service';
import {Router} from '@angular/router';
import {CustomerTypeService} from '../../service/customer-type.service';
import {Toast, ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  customerType: CustomerType[] = [];
  customerForm: FormGroup = new FormGroup({
    type: new FormControl('', [Validators.required]),
    name: new FormControl('', [Validators.required, Validators.pattern('^[A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*(?:[ ][A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*)*$')]),
    dayOfBirth: new FormControl('', [Validators.required]),
    gender: new FormControl('', [Validators.required]),
    idCard: new FormControl('', [Validators.required, Validators.pattern('^\\d{9}|\\d{12}$')]),
    phone: new FormControl('', [Validators.required, Validators.pattern('^\\+84\\d{9,10}$')]),
    email: new FormControl('', [Validators.required, Validators.email]),
    address: new FormControl('', [Validators.required]),
  });

  constructor(private customerService: CustomerService,
              private type: CustomerTypeService,
              private router: Router,
              private toast: ToastrService) {
  }

  ngOnInit(): void {
    this.getCustomerType();
  }

  submit() {
    const customer = this.customerForm.value;
    this.type.findById(customer.type).subscribe(customerType => {
      customer.type = {
        id: customerType.id,
        name: customerType.name
      };
      this.customerService.saveCustomer(customer).subscribe(() => {
        this.customerForm.reset();
        this.router.navigate(['/customer']);
        this.toast.success('Thêm mới thành công', 'Thông báo');
      }, error => {
        console.log(error);
      });
    });
  }

  getCustomerType(): void {
    this.type.getAll().subscribe(customerType => {
      this.customerType = customerType;
    });
  }

}
