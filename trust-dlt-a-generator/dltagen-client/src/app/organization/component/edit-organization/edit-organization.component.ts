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
  @Input() orderer?: boolean;

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
    this.organizationService.getCAConfig(this.organization.id).subscribe(config => 
      this.downloadFile(config, "application/x-yaml", this.organization.ca?.name + ".yaml"));
  }

  getConfig() {
    this.organizationService.getConfig(this.organization.id).subscribe(config => 
      this.downloadFile(config, "application/x-yaml", this.organization.name + ".yaml"));
  }

  getOrdererConfig() {
    this.organizationService.getOrdererConfig(this.organization.id).subscribe(config =>
      this.downloadFile(config, "application/x-yaml", "orderer.yaml"));
  }

  uploadPEM(event: Event) {
    const files:FileList|null = (event.target as HTMLInputElement).files;
    if(files && files.length > 0) {
      const file:File|null = files.item(0);
      if(file) {
        const formData = new FormData();
        formData.append("pem", file);
        if(this.orderer) {
          this.fileUploadService.uploadPEMOrderer(formData).subscribe(zip => {
            this.downloadFile(zip, "application/zip", "crypto.zip")
            this.organization.status = "UP";
          });
        } else {
          this.fileUploadService.uploadPEM(this.organization.id, formData).subscribe(zip => {
            this.downloadFile(zip, "application/zip", "crypto.zip")
            this.organization.status = "UP";
          });
        }
      }
    }
  }

  downloadFile(config: any, mimeType: string, filename: string) {
    let blob = new Blob([config], {type: mimeType});
      var a = document.createElement("a");
      a.href = window.URL.createObjectURL(blob);
      a.download = filename;
          // start download
          a.click();
  }

}
