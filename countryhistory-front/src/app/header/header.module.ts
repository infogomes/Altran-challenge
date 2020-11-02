import { NgModule } from '@angular/core';
import { HearderComponent } from '../header/hearder/hearder.component';
import { HeaderService } from './header.service';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from '../app-routing.module';




@NgModule({
  declarations: [HearderComponent],
  imports: [BrowserModule, AppRoutingModule, CommonModule, ReactiveFormsModule],
  exports: [HearderComponent],
  providers: [HeaderService]
})
export class HeaderModule { }
