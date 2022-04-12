import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { NewChannelComponent } from './channel/component/new-channel/new-channel.component';
import { ApiInterceptor } from './config/ApiInterceptor';
import { EditChannelComponent } from './channel/component/edit-channel/edit-channel.component';
import { ViewChannelComponent } from './channel/component/view-channel/view-channel.component';
import { EditOrganizationComponent } from './organization/component/edit-organization/edit-organization.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    NewChannelComponent,
    EditChannelComponent,
    ViewChannelComponent,
    EditOrganizationComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: ApiInterceptor,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
