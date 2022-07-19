import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { Channel } from '../../domain/Channel';
import { Organization } from '../../domain/Organization';
import { ChannelService } from '../../service/channel.service';

@Component({
  selector: 'app-edit-channel',
  templateUrl: './edit-channel.component.html',
  styleUrls: ['./edit-channel.component.scss']
})
export class EditChannelComponent implements OnInit {

  @Input() channel!: Channel;

  constructor(private channelService: ChannelService) { }

  ngOnInit(): void {
  }

  anyOrgsNotCreated(): boolean {
    return this.channel.organizations.some(o => o.status == 'NOT_CREATED');
  }

  organizationUp(organization: Organization): boolean {
    return organization.status == 'UP';
  }

  getArtifacts() {
    this.channelService.getArtifacts(this.channel).subscribe(artifacts =>
      this.downloadFile(artifacts, 'application/zip', 'artifacts.zip'));
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
