import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {FacilityType} from '../../model/facility-type';
import {FacilityTypeService} from '../../service/facility-type.service';
import {FacilityService} from '../../service/facility.service';

@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  facilityForm: FormGroup;
  id: number;
  facilityTypes: FacilityType[] = [];

  constructor(private facilityService: FacilityService,
              private type: FacilityTypeService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getFacility(this.id);
    });
  }

  ngOnInit(): void {
    this.getFacilityTypes();
  }

  editFacility(id: number) {
    const facility = this.facilityForm.value;
    this.type.findById(facility.facilityTypeId).subscribe(facilityType => {
      facility.facilityTypeId = {
        id: facilityType.id,
        name: facilityType.name
      };
      this.facilityService.updateFacility(id, facility).subscribe(() => {
        this.router.navigate(['/facility']);
      }, error => {
        console.log(error);
      });
    });
  }
  getFacility(id: number) {
    return this.facilityService.findById(id).subscribe(facility => {
      this.facilityForm = new FormGroup({
        id: new FormControl(facility.id),
        facilityName: new FormControl(facility.facilityName),
        are: new FormControl(facility.are),
        cost: new FormControl(facility.cost),
        maxPeople: new FormControl(facility.maxPeople),
        rentTypeId: new FormControl(facility.rentTypeId),
        facilityTypeId: new FormControl(facility.facilityTypeId.id),
        standardRoom: new FormControl(facility.standardRoom),
        descriptionOtherConvenience: new FormControl(facility.descriptionOtherConvenience),
        poolArea: new FormControl(facility.poolArea),
        numberOffloors: new FormControl(facility.numberOffloors),
        facalityFree: new FormControl(facility.facalityFree),
        facalityImg: new FormControl(facility.facalityImg),
      });
    });
  }

  getFacilityTypes(): void {
    this.type.getAll().subscribe(facilityTypes => {
      this.facilityTypes = facilityTypes;
    });
  }

}
