import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment, url } from 'src/environments/environment';

@Injectable()
export class HistoryService {
    URL = url(environment.apiHistoryCountry)+"/histories"
    constructor(private http: HttpClient) { }

    getAll(): Observable<any> {
        return this.http.get(this.URL);
    }
}