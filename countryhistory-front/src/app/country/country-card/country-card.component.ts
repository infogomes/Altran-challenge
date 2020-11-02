import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Country } from '../country.model';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'ch-country-card',
  templateUrl: './country-card.component.html'
})
export class CountryCardComponent implements OnInit {

  country: any;

  constructor(ActivatedRoute: ActivatedRoute, router: Router, private modalService: NgbModal) {
    if (router.getCurrentNavigation().extras.state)
      this.country = router.getCurrentNavigation().extras.state;
    else this.country = new Country(); 
  }

  ngOnInit(): void {
  }
}


