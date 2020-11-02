import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment, url } from 'src/environments/environment';

@Injectable()
export class HeaderService {
    URL = url(environment.apiHeader)+"/countries"

    constructor(private http: HttpClient) { }

    getByName(name: string): Observable<any> {
        const options =
            { params: new HttpParams().set('name', name) }
        return this.http.get(this.URL, options);
    }
}