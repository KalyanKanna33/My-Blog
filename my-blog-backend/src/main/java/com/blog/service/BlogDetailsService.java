package com.blog.service;

import com.blog.entity.BlogDetails;

import java.util.List;

public interface BlogDetailsService {

    BlogDetails create (BlogDetails blogDetails);

    List<BlogDetails> getAll();

}
