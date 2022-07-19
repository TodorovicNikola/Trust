import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListChannelComponent } from './channel/component/list-channel/list-channel.component';
import { NewChannelComponent } from './channel/component/new-channel/new-channel.component';
import { PageViewChannelComponent } from './channel/component/page-view-channel/page-view-channel.component';
import { ListOrdererComponent } from './organization/component/list-orderer/list-orderer.component';

const routes: Routes = [
  { path: 'new', component: NewChannelComponent},
  { path: 'channels', component: ListChannelComponent},
  { path: 'channel/:id', component: PageViewChannelComponent},
  { path: 'orderer', component: ListOrdererComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
