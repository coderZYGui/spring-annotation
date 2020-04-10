package com.zy.config;

import com.zy.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
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

        懒加载:
            单例bean: 默认在容器启动的时候创建对象;
            懒加载: 容器启动不创建对象,第一次使用(获取)Bean创建对象,并初始化
     */
    //@Scope("prototype")
    @Scope
    @Lazy //第一次使用Bean的时候创建,不使用则不创建(即使IoC容器启动了)
    @Bean
    public Person person(){
        System.out.println("给容器中添加Person...");
        return new Person("张三", 22);
    }
}
