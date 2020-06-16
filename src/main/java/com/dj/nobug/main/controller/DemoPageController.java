package com.dj.nobug.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class DemoPageController {

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index() {
        return "demo/index";
    }

}
