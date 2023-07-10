import { Component, OnInit } from '@angular/core';
import { Channel } from '../../domain/Channel';
import { ChannelService } from '../../service/channel.service';

@Component({
  selector: 'app-list-channel',
  templateUrl: './list-channel.component.html',
  styleUrls: ['./list-channel.component.scss']
})
export class ListChannelComponent implements OnInit {

  channels: Channel[] = [];

  constructor(private channelService: ChannelService) { }

  ngOnInit(): void {
    this.channelService.getAll().subscribe(channels => this.channels = channels);
  }

}
