import {FacilityType} from './facility-type';

export interface Facility {
  id?: number;
  facilityName?: string;
  are?: number;
  cost?: number;
  maxPeople?: number;
  rentTypeId?: number;
  facilityTypeId?: FacilityType;
  standardRoom?: string;
  descriptionOtherConvenience?: string;
  poolArea?: number;
  numberOffloors?: number;
  facalityFree?: string;
  facalityImg?: string;
}
