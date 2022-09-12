import {Component, OnInit} from '@angular/core';
import {Facility} from '../model/facility';
import {FacilityService} from '../service/facility.service';

@Component({
  selector: 'app-facility',
  templateUrl: './facility.component.html',
  styleUrls: ['./facility.component.css']
})
export class FacilityComponent implements OnInit {
  facilities: Facility[] = [];
  faclityObjModal: Facility;
  id: number;
  name: string;

  constructor(private facilityService: FacilityService) {
  }

  ngOnInit(): void {
    this.getAll();
    this.displayModalDetail(1);
  }

  getAll(): void {
    this.facilityService.getAll().subscribe(facility => {
      this.facilities = facility;
    });
  }

  displayModalDetail(id: number): void {
    this.facilityService.findById(id).subscribe(facility => {
      this.faclityObjModal = facility;
    });
  }
  openDelete(id: number, name: string): void {
    this.id = id;
    this.name = name;
  }

  delete(id: number): void {
    this.facilityService.deleteFacility(id).subscribe(() => {
      this.getAll();
    }, e => {
      console.log(e);
    });
  }
}
