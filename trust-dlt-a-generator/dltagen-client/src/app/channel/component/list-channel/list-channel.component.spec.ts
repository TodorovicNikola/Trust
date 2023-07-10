import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListChannelComponent } from './list-channel.component';

describe('ListChannelComponent', () => {
  let component: ListChannelComponent;
  let fixture: ComponentFixture<ListChannelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListChannelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListChannelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
