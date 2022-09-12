import {Customer} from './customer';
import {Facility} from './facility';

export interface Contract {
  idContarcct?: number;
  facility?: Facility;
  customer?: Customer;
  startDate?: string;
  endDate?: string;
  deposit?: number;
  totalMoney?: number;
}
