package com.blog.service.blogDetails;

import com.blog.entity.BlogDetails;

import java.util.List;

public interface BlogDetailsService {

    List<BlogDetails> getAllBlog();
    BlogDetails getBlog(String id);
    BlogDetails create(BlogDetails blogDetails);
    BlogDetails update(String id, BlogDetails blogDetails);
    BlogDetails delete(String id);

}
