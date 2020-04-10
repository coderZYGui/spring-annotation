package com.zy.test;

import com.zy.beans.Person;
import com.zy.config.MainConfig;
import com.zy.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:40
 */
public class IoCTest {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig2.class);

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

    @Test
    public void test3(){
        // 根据Person类型来获取容器中bean的名称
        String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);

        // 动态获取环境变量的值: Mac OS X
        Environment environment = ctx.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        for (String name : beanNamesForType) {
            System.out.println(name);
        }

        Map<String, Person> persons = ctx.getBeansOfType(Person.class);
        System.out.println(persons);
    }

}
