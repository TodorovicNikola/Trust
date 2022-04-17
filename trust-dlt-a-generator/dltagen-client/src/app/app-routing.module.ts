import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListChannelComponent } from './channel/component/list-channel/list-channel.component';
import { NewChannelComponent } from './channel/component/new-channel/new-channel.component';
import { PageViewChannelComponent } from './channel/component/page-view-channel/page-view-channel.component';

const routes: Routes = [
  { path: 'new', component: NewChannelComponent},
  { path: 'channels', component: ListChannelComponent},
  { path: 'channel/:id', component: PageViewChannelComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
