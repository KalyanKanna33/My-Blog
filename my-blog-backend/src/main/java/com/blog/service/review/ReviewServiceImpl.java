package com.blog.service.review;

import com.blog.entity.Review;
import com.blog.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository repository;

    public ReviewServiceImpl(ReviewRepository repository) {
        this.repository = repository;
    }

    @Override
    public Review getReview(String id) {
        return null;
    }

    @Override
    public Review getPostReview(String postId) {
        return null;
    }

    @Override
    public Review create(String postId, Review review) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Review findByMobile(String mobileNumber) {
        return null;
    }

}




