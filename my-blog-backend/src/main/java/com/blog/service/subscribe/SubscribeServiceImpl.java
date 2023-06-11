package com.blog.service.subscribe;

import com.blog.entity.Subscribe;
import com.blog.repository.SubScribeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SubscribeServiceImpl implements SubscribeService {

    private final SubScribeRepository repository;

    public SubscribeServiceImpl(SubScribeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Subscribe> getAllSubscribe() {
        return null;
    }

    @Override
    public Subscribe create(Subscribe subscribe) {
        return null;
    }

    @Override
    public void UnSubscribe(String id) {

    }

}




