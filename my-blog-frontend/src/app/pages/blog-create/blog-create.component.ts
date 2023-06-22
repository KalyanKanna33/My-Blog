import { Component } from '@angular/core';
import { BlogDetails } from 'src/app/model/BlogDetails.model';
import { Review } from 'src/app/model/Review.model';
import { BlogDetailsService } from 'src/app/service/blog-details.service';

@Component({
  selector: 'app-blog-create',
  templateUrl: './blog-create.component.html',
  styleUrls: ['./blog-create.component.css']
})
export class BlogCreateComponent {

  blog:BlogDetails;
  hashTagValue=''
  hashTag:string[] = []
  review:Review[] = []

  constructor(private service:BlogDetailsService) {
    this.blog = new BlogDetails('','','','','','','',this.hashTag,this.review)
  }

  addHashTag() {
    if(this.hashTagValue && this.hashTagValue.trim() !== '') {
      this.hashTag.push(this.hashTagValue.trim())
      this.hashTagValue = ''
    }
  }

  onSubmitForm() {
    this.service.create(this.blog).subscribe({
      next:(data) => {
        location.reload();
      },
      error: (err) => {
        console.log(err)
      }
    })
  }

}




