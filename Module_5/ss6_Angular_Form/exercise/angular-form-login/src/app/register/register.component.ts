import {Component, OnInit} from '@angular/core';
import {User} from '../user';
import {AbstractControl, FormControl, FormGroup, ValidationErrors, Validators} from '@angular/forms';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() {
  }

  ngOnInit(): void {
  }

  users: User[] = [];

  formRegister = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.pattern('^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$')]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)]),
    confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
    age: new FormControl('', [Validators.required, Validators.min(18)]),
    gender: new FormControl('', [Validators.required]),
    phone: new FormControl('', [Validators.required, Validators.pattern('[0-9 ]{10}')])
  }, [this.confirmPassword]);

  confirmPassword(control: AbstractControl) {
    console.log(control.value.confirmPassword == control.value.password);
    if (control.value.confirmPassword != control.value.password) {
      return {'gte': true};
    }
    return null;
  }

  onSubmit() {
    if (this.formRegister.valid) {
      console.log(this.formRegister);
    }
  }
}
