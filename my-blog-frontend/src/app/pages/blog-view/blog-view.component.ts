import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { BlogDetails } from 'src/app/model/BlogDetails.model';
import { BlogDetailsService } from 'src/app/service/blog-details.service';

@Component({
  selector: 'app-blog-view',
  templateUrl: './blog-view.component.html',
  styleUrls: ['./blog-view.component.css']
})
export class BlogViewComponent {

  blog:BlogDetails[] = []

  constructor(private service:BlogDetailsService, private router: Router) {

  }

}
