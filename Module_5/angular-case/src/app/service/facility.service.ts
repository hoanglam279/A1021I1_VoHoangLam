import { Injectable } from '@angular/core';
import {Facility} from '../model/facility';
import {environment} from '../../environments/environment';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';

const API_URL = `${environment.apiUrl}`;


@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  constructor(private http: HttpClient) {}
  getAll(): Observable<Facility[]> {
    return this.http.get<Facility[]>(API_URL + '/facility');
  }

  saveFacility(facility: Facility) {
    return this.http.post<Facility>(API_URL + '/facility', facility);
  }

  findById(id: number): Observable<Facility> {
    return this.http.get<Facility>(`${API_URL}/facility/${id}`);
  }

  updateFacility(id: number, facility: Facility): Observable<Facility> {
    return this.http.put<Facility>(`${API_URL}/facility/${id}`, facility);
  }

  deleteFacility(id: number): Observable<Facility> {
    return this.http.delete<Facility>(`${API_URL}/facility/${id}`);
  }
}
