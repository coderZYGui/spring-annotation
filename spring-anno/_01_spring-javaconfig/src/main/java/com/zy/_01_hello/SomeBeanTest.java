package com.zy._01_hello;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 08:25
 */
public class SomeBeanTest {

    /*
        Spring XML Config
     */
    @Test
    public void test(){
        // 加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 从Spring容器中获取SomeBean的实例
        SomeBean someBean = ctx.getBean("somebean", SomeBean.class);
        System.out.println(someBean);
    }

    /*
        Spring Java Config
     */
    @Test
    public void test1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        SomeBean someBean = ctx.getBean(SomeBean.class);
        System.out.println(someBean);
    }

}
