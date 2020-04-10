package com.zy._02_bean;

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

    /*
            方法的名字 ---> bean的id
            方法的返回值类型 ---> bean的class类型
            @Bean(name="") ---> name可以为bean起多个id名(如果不设置name,默认id名就是方法名)
     */
    // 方式一: 配置init, destory
    //@Bean(name="sb", initMethod = "init", destroyMethod = "destory")

    @Bean(name="sb")
    public SomeBean someBean1() {
        return new SomeBean();
    }
}
