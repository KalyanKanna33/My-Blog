package com.blog.repository;

import com.blog.entity.BlogDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogDetailsRepository extends MongoRepository<BlogDetails, String> {
}
