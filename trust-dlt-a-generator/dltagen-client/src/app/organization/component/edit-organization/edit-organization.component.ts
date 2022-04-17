import { Component, Input, OnInit } from '@angular/core';
import { CertificateAuthority } from 'src/app/channel/domain/CertificateAuthority';
import { Organization } from 'src/app/channel/domain/Organization';
import { FileUploadService } from 'src/app/channel/service/file-upload.service';
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

  constructor(private organizationService: OrganizationService, private fileUploadService: FileUploadService) { }

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

  uploadPEM(event: Event) {
    const files:FileList|null = (event.target as HTMLInputElement).files;
    if(files && files.length > 0) {
      const file:File|null = files.item(0);
      if(file) {
        const formData = new FormData();
        formData.append("pem", file);
        this.fileUploadService.uploadPEM(this.organization.id, formData).subscribe(zip => {
          let blob = new Blob([zip], {type: 'application/zip'});
          var a = document.createElement("a");
          a.href = window.URL.createObjectURL(blob);
          a.download = "crypto.zip";
          // start download
          a.click();
        });
      }
    }
  }

}
