import { Review } from "./Review.model";

export class BlogDetails {

    constructor(
            public id:string,
            public author:string, 
            public title:string, 
            public topic:string, 
            public email:string, 
            public blogText:string, 
            public imagePath:string,
            public hashTags:string[], 
            public review:Review[]
        ) {

    }

}
