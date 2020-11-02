import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { ModalAlertComponent } from '../../modal/modal-alert/modal-alert.component';
import { HistoryService } from '../history.service';

@Component({
  selector: 'ch-country-history',
  templateUrl: './country-history.component.html'
})
export class CountryHistoryComponent implements OnInit {

  page = 1;
  pageSize = 10;
  history: History[];

  constructor(private historyService: HistoryService, private modalService: NgbModal) {
    this.historyService.getAll().subscribe(
      hist => {
        this.history = hist;
      },
      err => {
        this.history = []
        const modalRef = this.modalService.open(ModalAlertComponent);
        modalRef.componentInstance.message = err.error.message? err.error.message.substring(3) : "Something is wrong";
      }
    );
  }

  ngOnInit(): void {

  }

}
