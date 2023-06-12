package com.blog.service.blogDetails;

import com.blog.entity.BlogDetails;
import com.blog.repository.BlogDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BlogDetailsServiceImpl implements BlogDetailsService{

    private final BlogDetailsRepository repository;

    public BlogDetailsServiceImpl(BlogDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BlogDetails> getAllBlog() {
        return null;
    }

    @Override
    public BlogDetails getBlog(String id) {
        return null;
    }

    @Override
    public BlogDetails create(BlogDetails blogDetails) {
        return null;
    }

    @Override
    public BlogDetails update(String id, BlogDetails blogDetails) {
        return null;
    }

    @Override
    public BlogDetails delete(String id) {
        return null;
    }

    @Override
    public List<BlogDetails> findByAuther(String auther) {
        return null;
    }

    @Override
    public List<BlogDetails> findByTitleStartingWith(String title) {
        return null;
    }

    @Override
    public List<BlogDetails> findByTopicStartingWith(String topic) {
        return null;
    }

    @Override
    public List<BlogDetails> findByEmail(String email) {
        return null;
    }

    @Override
    public List<BlogDetails> findByBlogTextStartingWith(String blogText) {
        return null;
    }

}



