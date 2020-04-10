package com.zy._02_bean;

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
        Spring Java Config
     */
    @Test
    void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        SomeBean someBean = ctx.getBean("sb", SomeBean.class);
        System.out.println(someBean);
        ctx.close(); // 非Spring Test,容器不会正常关闭,调用close方法才可以
    }

}
