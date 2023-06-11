package com.blog.service.review;

import com.blog.entity.Review;

public interface ReviewService {

    Review getReview(String id);
    Review getPostReview(String postId);
    Review create(String postId, Review review);
    void delete(String id);
    Review findByMobile(String mobileNumber);

}
