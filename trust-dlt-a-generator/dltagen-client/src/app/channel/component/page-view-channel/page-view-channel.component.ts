import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Channel } from '../../domain/Channel';
import { ChannelService } from '../../service/channel.service';

@Component({
  selector: 'app-page-view-channel',
  templateUrl: './page-view-channel.component.html',
  styleUrls: ['./page-view-channel.component.scss']
})
export class PageViewChannelComponent implements OnInit {

  channel!: Channel;
  constructor(private route: ActivatedRoute, private channelService: ChannelService) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      let id = params['id'];
      this.channelService.getById(id).subscribe(channel => this.channel = channel);
    })
  }

}
