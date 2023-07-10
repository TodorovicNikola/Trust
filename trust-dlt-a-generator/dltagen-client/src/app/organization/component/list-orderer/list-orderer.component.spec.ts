import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOrdererComponent } from './list-orderer.component';

describe('ListOrdererComponent', () => {
  let component: ListOrdererComponent;
  let fixture: ComponentFixture<ListOrdererComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListOrdererComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOrdererComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
