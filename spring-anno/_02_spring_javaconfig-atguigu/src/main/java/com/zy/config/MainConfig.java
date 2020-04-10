package com.zy.config;

import com.zy.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:24
 */

// 配置类 == 配置文件
@Configuration  // 告诉Spring这是一个配置类
//@ComponentScan(value = "com.zy")    // 不写默认扫描当前类所在包(及其子包)下的所有类(指定要扫描的包)

//@ComponentScan(value = "com.zy", excludeFilters = {
//        // excludeFilters: FilterType是过滤条件(这里是根据注解来过滤); 将Controller,Service的bean过滤掉(不扫描它们)
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
//})
@ComponentScan(value = "com.zy", includeFilters = {
        // excludeFilters: FilterType是过滤条件(这里是根据注解来过滤); 将Controller,Service的bean过滤掉(不扫描它们)
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
}, useDefaultFilters = false)

// @ComponentScan   value: 指定扫描的包
// excludeFilters = Filter[] : 指定扫描的时候按照什么规则排除哪些组件
// includeFilters = Filter[] : 指定扫描的时候只需要包含哪些组件
public class MainConfig {

    // 给容器中注册一个Bean, 类型为返回值类型, id默认是方法名
    @Bean("person")
    public Person person(){
        return new Person("lisi", 22);
    }
}
