import { Component, Input, OnDestroy, OnInit } from '@angular/core';
import { Channel } from '../../domain/Channel';

@Component({
  selector: 'app-edit-channel',
  templateUrl: './edit-channel.component.html',
  styleUrls: ['./edit-channel.component.scss']
})
export class EditChannelComponent implements OnInit {

  @Input() channel!: Channel;

  constructor() { }

  ngOnInit(): void {
  }

  anyOrgsNotCreated(): boolean {
    return this.channel.organizations.some(o => o.status == 'NOT_CREATED');
  }

}
