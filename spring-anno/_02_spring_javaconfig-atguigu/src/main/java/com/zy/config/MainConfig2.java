package com.zy.config;

import com.zy.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 18:02
 */
@Configuration
public class MainConfig2 {


    /*
        prototype: 多例的 : IoC容器启动 并不会去调用方法创建对象 放在容器中, 每次获取的时候才会调用方法创建对象;
        singleton: 单例的 : IoC容器启动会 调用方法创建对象 放到IoC容器中;
        request: 同一次请求创建一个实例
        session: 同一个session创建一个实例
     */
    @Scope("prototype")
    //@Scope
    @Bean
    public Person person(){
        System.out.println("给容器中添加Person...");
        return new Person("张三", 22);
    }
}
