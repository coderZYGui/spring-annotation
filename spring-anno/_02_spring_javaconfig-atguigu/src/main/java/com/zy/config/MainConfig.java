package com.zy.config;

import com.zy.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 17:24
 */

// 配置类 == 配置文件
@Configuration // 告诉Spring这是一个配置类
public class MainConfig {

    // 给容器中注册一个Bean, 类型为返回值类型, id默认是方法名
    @Bean("sb")
    public Person person(){
        return new Person("lisi", 22);
    }
}
