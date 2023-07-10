import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Organization } from 'src/app/channel/domain/Organization';

@Injectable({
  providedIn: 'root'
})
export class OrdererService {

  constructor(private http: HttpClient) { }

  getOrderers(): Observable<Organization[]> {
    return this.http.get<Organization[]>("/orderer");
  }
}
