package com.blog.service.subscribe;

import com.blog.entity.Subscribe;

import java.util.List;

public interface SubscribeService {
    List<Subscribe> getAllSubscribe();
    Subscribe create(Subscribe subscribe);
}
