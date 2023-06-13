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

  create(blogDetails:BlogDetails, file:File): Observable<BlogDetails> {

    const formData = new FormData();

    formData.append('file',file);
    formData.append('blogDetails',JSON.stringify(blogDetails))

    // const headers = new HttpHeaders().set('Content-Type', 'multipart/form-data');

    // const header = new HttpHeaders();
    // header.append('Content-Type', 'multipart/form-data');

    return this.http.post<BlogDetails>("http://localhost:9000/blog/create",formData);
  }

}
