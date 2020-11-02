import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ModalAlertComponent } from '../modal/modal-alert/modal-alert.component';
import { CountryCardComponent } from './country-card/country-card.component';





@NgModule({
  imports: [BrowserModule, NgbModule],
  declarations: [CountryCardComponent, ModalAlertComponent],
  exports: [CountryCardComponent],
  bootstrap: [CountryCardComponent,ModalAlertComponent],
  entryComponents: [CountryCardComponent, ModalAlertComponent]
})
export class CountryComponentModule {}