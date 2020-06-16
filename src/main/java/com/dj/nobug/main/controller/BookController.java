package com.dj.nobug.main.controller;

import com.alibaba.fastjson.JSON;
import com.dj.nobug.main.bean.AjaxResponseBody;
import com.dj.nobug.main.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping(path = "/book", method = RequestMethod.POST)
    public String queryBooks() {
        AjaxResponseBody ajaxResponseBody = new AjaxResponseBody();
        ajaxResponseBody.setResult(bookService.queryBooks());
        return JSON.toJSONString(ajaxResponseBody);
    }

}
