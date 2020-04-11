package com.zy.controller;

import com.zy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:37
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
