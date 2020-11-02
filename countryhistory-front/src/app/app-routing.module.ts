import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CountryCardComponent } from './country/country-card/country-card.component';
import { CountryHistoryComponent } from './history/country-history/country-history.component';

const routes: Routes = [
  { path: 'list', component: CountryHistoryComponent },
  { path: 'card', component: CountryCardComponent },
  { path: '', component: CountryHistoryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { onSameUrlNavigation: 'reload' })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
