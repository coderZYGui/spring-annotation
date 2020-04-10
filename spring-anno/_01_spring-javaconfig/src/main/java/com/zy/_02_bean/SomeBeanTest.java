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
    public void test1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        SomeBean someBean = ctx.getBean(SomeBean.class); // 根据bean类型去找
        System.out.println(someBean);
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        SomeBean someBean1 = ctx.getBean("someBean1", SomeBean.class); // bean的id去找
        System.out.println(someBean1);

        SomeBean someBean2 = ctx.getBean("someBean2", SomeBean.class);
        System.out.println(someBean2);

        SomeBean someBean3 = ctx.getBean("sb", SomeBean.class);
        System.out.println(someBean3);

        SomeBean someBean4 = ctx.getBean("sbb", SomeBean.class);
        System.out.println(someBean4);
    }

}
