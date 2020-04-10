package com.zy;

import com.zy.beans.Person;
import com.zy.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:26
 */
public class MainTest {
    public static void main(String[] args) {
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);*/

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);

        // 根据Person的类型,找到其bean的名称
        String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }
}
