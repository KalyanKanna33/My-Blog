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
  file:File | undefined;

  constructor(private service:BlogDetailsService) {
    this.blog = new BlogDetails('','','','','','','',this.hashTag,this.review)
  }

  onFileSelected(event:any) {
    console.log(event)
    if(event.target.files.length > 0) {
      this.file = event.target.files[0];
    }
  }

  addHashTag() {
    if(this.hashTagValue && this.hashTagValue.trim() !== '') {
      this.hashTag.push(this.hashTagValue.trim())
      this.hashTagValue = ''
    }
  }

  onSubmitForm() {
    let newBlog:BlogDetails = new BlogDetails('',this.blog.author, this.blog.title, this.blog.topic, this.blog.email, this.blog.blogText,'', this.hashTag, this.review)
    if(this.file)
      this.service.create(newBlog,this.file).subscribe({
        next: (data) => {
          this.blog = data
          console.log("Success return : ",data)
        },
        error: (data) => {
          console.log("Error : ",data)
        }
      });
  }

}




