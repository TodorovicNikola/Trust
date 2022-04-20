import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CertificateAuthority } from 'src/app/channel/domain/CertificateAuthority';
import { Organization } from 'src/app/channel/domain/Organization';

@Injectable({
  providedIn: 'root'
})
export class OrganizationService {

  constructor(private http: HttpClient) { }

  addCA(orgId: String, ca: CertificateAuthority): Observable<Organization> {
    return this.http.post<Organization>("/organization/" + orgId + "/ca", ca);
  }

  getCAConfig(orgId: String): Observable<any> {
    return this.http.get("/organization/" + orgId + "/ca-config", {responseType: "text"});
  }

  getConfig(orgId: String): Observable<any> {
    return this.http.get("/organization/" + orgId + "/config", {responseType: "text"});
  }
}
