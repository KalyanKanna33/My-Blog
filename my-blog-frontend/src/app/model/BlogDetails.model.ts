import { Review } from "./Review.model";

export class BlogDetails {

    public id:string
    public author:string
    public title:string
    public topic:string
    public email:string
    public blogText:string
    public imagePath:string
    public hashTags:string[]
    public review:Review[]

    constructor(
            id:string,
            author:string, 
            title:string, 
            topic:string, 
            email:string, 
            blogText:string, 
            imagePath:string,
            hashTags:string[], 
            review:Review[]
        ) {
            this.id = id;
            this.author = author;
            this.title = title;
            this.topic = topic;
            this.email = email;
            this.blogText = blogText;
            this.imagePath = imagePath;
            this.hashTags = hashTags;
            this.review = review
    }

}
