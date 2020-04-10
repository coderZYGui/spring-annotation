package com.zy.test;

import com.zy.config.MainConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class IoCTest {

    @Test
    public void test1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        // 看容器中有哪些bean,返回这些bean的名称
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
