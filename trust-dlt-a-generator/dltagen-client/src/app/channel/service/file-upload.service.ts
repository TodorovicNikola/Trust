import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Channel } from '../domain/Channel';

@Injectable({
  providedIn: 'root'
})
export class FileUploadService {

  constructor(private http: HttpClient) { }

  uploadCBP(formData: FormData): Observable<Channel> {
    return this.http.post<Channel>("/channel", formData);
  }

  uploadPEM(orgId: String, formData: FormData): Observable<any> {
    return this.http.post("/organization/" + orgId + "/crypto", formData, {responseType: 'arraybuffer'});
  }

  uploadPEMOrderer(formData: FormData): Observable<any> {
    return this.http.post("/orderer/crypto", formData, {responseType: 'arraybuffer'});
  }

}
