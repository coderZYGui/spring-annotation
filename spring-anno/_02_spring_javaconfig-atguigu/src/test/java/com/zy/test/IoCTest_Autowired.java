package com.zy.test;

import com.zy.config.MainConfigOfAutowired;
import com.zy.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/11 08:37
 */
public class IoCTest_Autowired {

    AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test1(){
        BookService bookService = act.getBean(BookService.class);
        System.out.println(bookService);

        // 拿到容器中的dao
        //BookDao bookDao = act.getBean("bookDao1",BookDao.class);
        //System.out.println(bookDao);

        act.close();
    }

    /**
     * 传入一个应用上下文对象(加载容器启动)
     * @param atx
     * 返回该容器中注册bean的名字
     */
    private void printBeans(AnnotationConfigApplicationContext atx) {
        String[] definitionNames = atx.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
