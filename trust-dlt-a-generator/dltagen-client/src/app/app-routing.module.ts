import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NewChannelComponent } from './channel/component/new-channel/new-channel.component';

const routes: Routes = [
  { path: 'new', component: NewChannelComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
