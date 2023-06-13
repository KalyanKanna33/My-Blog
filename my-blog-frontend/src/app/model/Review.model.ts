
export class Review {

    constructor(
            public id:string, 
            public postId:string, 
            public mobileNumber:string, 
            public views:number, 
            public rating:number, 
            public comment:string
        ) {

    }

}
