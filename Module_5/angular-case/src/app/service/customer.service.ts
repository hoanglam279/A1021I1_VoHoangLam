import {Injectable} from '@angular/core';
import {Customer} from '../model/customer';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(API_URL + '/customer');
  }

  saveCustomer(customer: Customer) {
    return this.http.post<Customer>(API_URL + '/customer', customer);
  }

  findById(id: number): Observable<Customer> {
    return this.http.get<Customer>(`${API_URL}/customer/${id}`);
  }

  updateCustomer(id: number, customer: Customer): Observable<Customer> {
    return this.http.put<Customer>(`${API_URL}/customer/${id}`, customer);
  }

  deleteCustomer(id: number): Observable<Customer> {
    return this.http.delete<Customer>(`${API_URL}/customer/${id}`);
  }
  searchCustomer(name: string): Observable<Customer[]> {
    return this.http.get<Customer[]>(`${API_URL}/customer?q=` + name);
  }

}

