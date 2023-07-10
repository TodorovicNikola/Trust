import { TestBed } from '@angular/core/testing';

import { OrdererService } from './orderer.service';

describe('OrdererService', () => {
  let service: OrdererService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OrdererService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
