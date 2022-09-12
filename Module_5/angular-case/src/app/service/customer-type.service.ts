import {Injectable} from '@angular/core';
import {Customer} from '../model/customer';
import {CustomerType} from '../model/customer-type';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {

  constructor(private http: HttpClient) {
  }
  getAll(): Observable<CustomerType[]> {
    return this.http.get<CustomerType[]>(API_URL + '/customerType');
  }

  findById(id: number): Observable<CustomerType> {
    return this.http.get<CustomerType>(API_URL + `/customerType/${id}`);
  }
}
