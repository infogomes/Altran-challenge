import { Component, Input } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'ch-modal-alert',
  templateUrl: './modal-alert.component.html'
})
export class ModalAlertComponent{

  @Input() message;

  constructor(public activeModal: NgbActiveModal) {}
}
