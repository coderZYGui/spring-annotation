package com.zy._08_profile;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 13:28
 */
public class AppTest2 {

    @Test
    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx.getBean(DataSource.class));
    }
}
