import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { ModalAlertComponent } from 'src/app/modal/modal-alert/modal-alert.component';
import { HeaderService } from '../header.service';

@Component({
  selector: 'ch-hearder',
  templateUrl: './hearder.component.html'
})
export class HearderComponent implements OnInit {

  countryForm = new FormGroup({
    countryName: new FormControl('', [
      Validators.required,
      Validators.minLength(3),
      Validators.maxLength(30)
    ])
  });

  constructor(private headerService: HeaderService, private route: Router, private modalService: NgbModal) { }

  ngOnInit(): void {

  }

  onSubmit() {
    this.headerService.getByName(this.countryForm.controls.countryName.value).subscribe(
      country => {
        this.route.navigateByUrl('/', { skipLocationChange: true }).then(() =>
          this.route.navigate(['card'], {
            state: country
          }));
      },
      err => {
        const modalRef = this.modalService.open(ModalAlertComponent);
        modalRef.componentInstance.message = err.error.message? err.error.message.substring(3) : "Something is wrong";
        this.route.navigateByUrl('/', { skipLocationChange: true }).then(() =>
          this.route.navigate(['list']));
      }
    );
  }
}
