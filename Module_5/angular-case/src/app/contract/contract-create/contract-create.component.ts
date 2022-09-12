import {Component, OnInit} from '@angular/core';
import {ContractService} from '../../service/contract.service';
import {Router} from '@angular/router';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Facility} from '../../model/facility';
import {Customer} from '../../model/customer';
import {CustomerService} from '../../service/customer.service';
import {FacilityService} from '../../service/facility.service';

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  // customer: Customer[] = this.customers.getAll();
  // facility: Facility[] = this.facilitys.getAll();
  constructor( private contractService: ContractService,
               private customers: CustomerService,
               private facilitys: FacilityService,
               private router: Router) { }
  contractForm: FormGroup = new FormGroup({
    facility: new FormControl(),
    customer: new FormControl(),
    startDate: new FormControl(),
    endDate: new FormControl(),
    deposit: new FormControl(),
    totalMoney: new FormControl('', [Validators.pattern('^[1-9]+$')]),
  });
  ngOnInit(): void {
  }
  submit() {
    const contract = this.contractForm.value;
    console.log(contract);
    this.contractService.saveContract(contract);
    this.contractForm.reset();
    this.router.navigate(['/contract']);
  }
}
