import { NgModule } from '@angular/core';
import { CountryHistoryComponent } from './country-history/country-history.component';
import { HistoryService } from './history.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';





@NgModule({
    imports: [BrowserModule, NgbModule],
    declarations: [CountryHistoryComponent],
    exports: [CountryHistoryComponent],
    bootstrap: [CountryHistoryComponent],
    providers: [HistoryService]
})
export class HistoryComponentModule { }