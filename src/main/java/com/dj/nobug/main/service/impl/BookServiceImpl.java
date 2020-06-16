package com.dj.nobug.main.service.impl;

import com.dj.nobug.main.mapper.BookMapper;
import com.dj.nobug.main.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public String queryBooks() {
        return bookMapper.queryBooks();
    }

}
