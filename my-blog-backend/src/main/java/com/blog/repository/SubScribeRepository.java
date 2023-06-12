package com.blog.repository;

import com.blog.entity.Subscribe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubScribeRepository extends MongoRepository<SubScribeRepository,String> {
    List<Subscribe> findByActiveSubscribeTrue();
    List<Subscribe> findByActiveSubscribeFalse();
}
