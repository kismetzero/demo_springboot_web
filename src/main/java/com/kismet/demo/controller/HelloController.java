package com.kismet.demo.controller;

import com.kismet.demo.dao.BooksMapper;
import com.kismet.demo.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    public BooksMapper booksMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot() {
        return "Hello Spring Boot！！";
    }

    @RequestMapping("/test")
    @ResponseBody
    public List<Books> testAllBooksList() {
        return  booksMapper.selectAllBooksList();
    }
}
