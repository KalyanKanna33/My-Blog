import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BlogDetails } from '../model/BlogDetails.model';

@Injectable({
  providedIn: 'root'
})
export class BlogDetailsService {

  constructor(private http:HttpClient) {

  }

  getAll(): Observable<BlogDetails[]> {
    return this.http.get<BlogDetails[]>("http://localhost:9000/blog/getAll");
  }

  create(blogDetails:BlogDetails): Observable<BlogDetails> {

    return this.http.post<BlogDetails>("http://localhost:9000/blog/create",blogDetails);
  }

}
