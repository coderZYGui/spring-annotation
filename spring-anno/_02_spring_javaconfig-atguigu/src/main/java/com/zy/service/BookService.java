package com.zy.service;

import com.zy.dao.BookDao;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:37
 */
@Service
@ToString
public class BookService {

    @Qualifier("bookDao2")
    @Autowired(required = false) // 如果没有找到装备的bean,也不会报错
    private BookDao bookDao1;

}
