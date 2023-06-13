package com.blog.controller;

import com.blog.entity.BlogDetails;
import com.blog.service.BlogDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/blog")
public class BlogDetailsController {

    private final BlogDetailsService service;

    public BlogDetailsController(BlogDetailsService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<BlogDetails> getAll() {
        log.info("getAll() -> | ");
        List<BlogDetails> all = service.getAll();
        log.info("getAll() -> | List BlogDetails : {}",all);
        return all;
    }

    @PostMapping(value = "/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public BlogDetails create(@RequestPart("file") MultipartFile file, @RequestPart("blogDetails") BlogDetails blogDetails) {

        log.info("create(BlogDetails) -> | BlogDetails : {}",blogDetails);
        BlogDetails blog = service.create(file, blogDetails);
        log.info("create(BlogDetails) -> | After Save BlogDetails : {}",blog);
        return blog;
    }

}
