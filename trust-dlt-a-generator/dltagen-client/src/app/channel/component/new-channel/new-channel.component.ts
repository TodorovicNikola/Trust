import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Channel } from '../../domain/Channel';
import { FileUploadService } from '../../service/file-upload.service';

@Component({
  selector: 'app-new-channel',
  templateUrl: './new-channel.component.html',
  styleUrls: ['./new-channel.component.scss']
})
export class NewChannelComponent implements OnInit, OnDestroy {

  fileUpload!: Subscription;
  channel!: Channel;

  constructor(private fileUploadService: FileUploadService) { }
  
  ngOnDestroy(): void {
    this.fileUpload.unsubscribe();
  }

  ngOnInit(): void {
  }

  upload(event: Event) {
    const files:FileList|null = (event.target as HTMLInputElement).files;
    if(files && files.length > 0) {
      const file:File|null = files.item(0);
      if(file) {
        const formData = new FormData();
        formData.append("channel", file);
        this.fileUpload = this.fileUploadService.upload(formData).subscribe(channel => this.channel = channel);

      }
    }
  }

}
