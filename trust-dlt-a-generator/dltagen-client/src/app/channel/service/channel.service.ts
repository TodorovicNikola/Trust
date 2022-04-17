import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Channel } from '../domain/Channel';

@Injectable({
  providedIn: 'root'
})
export class ChannelService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Channel[]> {
    return this.http.get<Channel[]>("/channel");
  }

  getById(id: String): Observable<Channel> {
    return this.http.get<Channel>("/channel/" + id);
  }
}
