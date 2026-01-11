import { Component, OnInit } from '@angular/core';
import { Organization } from 'src/app/channel/domain/Organization';
import { OrdererService } from '../../service/orderer.service';

@Component({
  selector: 'app-list-orderer',
  templateUrl: './list-orderer.component.html',
  styleUrls: ['./list-orderer.component.scss']
})
export class ListOrdererComponent implements OnInit {
  orderers: Organization[] = [];

  constructor(private ordereService: OrdererService) { }

  ngOnInit(): void {
    this.ordereService.getOrderers().subscribe(orderers => this.orderers = orderers);
  }

}
