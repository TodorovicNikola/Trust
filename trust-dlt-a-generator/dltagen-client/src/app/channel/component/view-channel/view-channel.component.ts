import { Component, Input, OnInit } from '@angular/core';
import { Channel } from '../../domain/Channel';

@Component({
  selector: 'app-view-channel',
  templateUrl: './view-channel.component.html',
  styleUrls: ['./view-channel.component.scss']
})
export class ViewChannelComponent implements OnInit {
  @Input() channel!: Channel;

  constructor() { }

  ngOnInit(): void {
  }

}
