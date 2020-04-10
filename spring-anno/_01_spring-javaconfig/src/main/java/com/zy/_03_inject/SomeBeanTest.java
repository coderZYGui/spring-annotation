package com.zy._03_inject;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        SomeBean someBean = ctx.getBean("someBean", SomeBean.class);
        System.out.println(someBean.getOtherBean());
        ctx.close();
    }

}
