package com.zy.test;

import com.zy.config.MainConfig;
import com.zy.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:40
 */
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

    @Test
    public void test2(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig2.class);
        // 看容器中有哪些bean,返回这些bean的名称
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }
        // 默认是单例的
        System.out.println("IoC容器创建完成...");
        Object person1 = ctx.getBean("person");
        Object person2 = ctx.getBean("person");
        System.out.println(person1 == person2);
    }

}
