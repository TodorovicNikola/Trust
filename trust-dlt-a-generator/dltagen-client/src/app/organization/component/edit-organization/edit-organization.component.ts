import { Component, Input, OnInit } from '@angular/core';
import { CertificateAuthority } from 'src/app/channel/domain/CertificateAuthority';
import { Organization } from 'src/app/channel/domain/Organization';
import { OrganizationService } from '../../service/organization.service';

@Component({
  selector: 'app-edit-organization',
  templateUrl: './edit-organization.component.html',
  styleUrls: ['./edit-organization.component.scss']
})
export class EditOrganizationComponent implements OnInit {

  @Input() organization!: Organization;

  ca: CertificateAuthority = {
    name: '',
    host: '',
    port: '',
    opPort: '',
    adminName: '',
    adminPassword: '',
  }

  constructor(private organizationService: OrganizationService) { }

  ngOnInit(): void {
  }

  caFilled(): boolean {
    return this.ca.host != '' &&
    this.ca.port != '' && 
    this.ca.opPort != '' && 
    this.ca.adminName != '' && 
    this.ca.adminPassword != '';
  }

  send() {
    this.organization.ca = this.ca;
    this.addCA(this.organization);
  }

  addCA(org: Organization) {
    this.organizationService.addCA(org.id, org.ca!).subscribe(org => this.organization = org);
  }

  getCAConfig() {
    this.organizationService.getCAConfig(this.organization.id).subscribe(config => {
      let blob = new Blob([config], {type: 'application/x-yaml'});
      var a = document.createElement("a");
      a.href = window.URL.createObjectURL(blob);
      a.download = this.organization.ca?.name + ".yaml";
          // start download
          a.click();
    })
  }

}
