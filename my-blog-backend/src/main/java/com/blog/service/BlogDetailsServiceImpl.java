package com.blog.service;

import com.blog.dao.blogDetails.BlogDetailsDao;
import com.blog.entity.BlogDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BlogDetailsServiceImpl implements BlogDetailsService {

    private final BlogDetailsDao dao;

    public BlogDetailsServiceImpl(BlogDetailsDao dao) {
        this.dao = dao;
    }

    @Override
    public BlogDetails create(BlogDetails blogDetails) {
        log.info("create(BlogDetails) -> | BlogDetails : {}",blogDetails);
        BlogDetails blog = dao.create(blogDetails);
        log.info("create(BlogDetails) -> | After Save BlogDetails : {}",blog);
        return blog;
    }

    @Override
    public List<BlogDetails> getAll() {
        log.info("getAll() -> | ");
        List<BlogDetails> all = dao.getAllBlog();
        log.info("getAll() -> | List BlogDetails : {}",all);
        return all;
    }

}
