package com.blog.service;

import com.blog.dao.blogDetails.BlogDetailsDao;
import com.blog.entity.BlogDetails;
import com.blog.exception.BlogDetailsImageNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class BlogDetailsServiceImpl implements BlogDetailsService {

    @Value("${image.upload.directory}")
    private String uploadDirectory;

    private final BlogDetailsDao dao;

    public BlogDetailsServiceImpl(BlogDetailsDao dao) {
        this.dao = dao;
    }

    @Override
    public BlogDetails create(MultipartFile file, BlogDetails blogDetails) {
        if(file.isEmpty()) {
            throw new BlogDetailsImageNotFoundException();
        }

        try {
            String filename = file.getOriginalFilename();
            file.transferTo((new File(uploadDirectory+"/"+filename)));
            blogDetails.setImagePath(filename);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
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
