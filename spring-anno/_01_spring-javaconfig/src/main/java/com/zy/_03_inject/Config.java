package com.zy._03_inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: Spring的配置类
 *
 * @author zygui
 * @date 2020/4/10 08:34
 */

@Configuration
public class Config {

    /*
          Bean的依赖注入方式:
          1、内部bean的方式
     */

    /*
        方式一: 相当于内部Bean的形式
        <bean id="" class="">
            <property name="otherBean">
                <bean class="" />  内部bean的方式
            </property>
        </bean>
        这种方式用的很少!
     */
    @Bean
    public SomeBean someBean() {
        SomeBean sb = new SomeBean();
        sb.setOtherBean(new OtherBean());
        return sb;
    }
}
