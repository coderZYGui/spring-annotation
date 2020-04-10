package com.zy._01_hello;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: Spring的配置类
 *
 * @author zygui
 * @date 2020/4/10 08:34
 */

/*
    <bean id="" class="" name="" init-method="" destory-method="" scope="">
        <property name="" value=""/>
        <property name="" ref=""/>
    </bean>
 */

// 把一个类标记为spring的配置对象; (类名Config可以简单理解为XML中的 beans)
@Configuration
public class Config {

    @Bean
    public SomeBean somebean(){
        return new SomeBean();
    }

}
