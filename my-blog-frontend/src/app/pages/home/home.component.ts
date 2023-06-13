import { Component } from '@angular/core';
import { BlogDetails } from 'src/app/model/BlogDetails.model';
import { BlogDetailsService } from 'src/app/service/blog-details.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  blog:BlogDetails[] = []

  constructor(private service:BlogDetailsService) {

  }

  ngOnInit() {
    this.service.getAll().subscribe({
      next: (data) => {
        this.blog = data;
        console.log("Success : ",data)
      },
      error: (data) => {
        console.log("Error : ",data)
      }
    })
  }


}
