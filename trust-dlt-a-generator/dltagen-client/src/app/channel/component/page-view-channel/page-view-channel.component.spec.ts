import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageViewChannelComponent } from './page-view-channel.component';

describe('PageViewChannelComponent', () => {
  let component: PageViewChannelComponent;
  let fixture: ComponentFixture<PageViewChannelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageViewChannelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PageViewChannelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
