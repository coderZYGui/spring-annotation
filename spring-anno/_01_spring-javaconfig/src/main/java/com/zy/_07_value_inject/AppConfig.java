package com.zy._07_value_inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 11:07
 */

/*
    @PropertySource 标签引入了需要加载的资源文件
    @PropertySources 引入多个资源文件
 */

@Configuration
@PropertySource("classpath:db.properties")
public class AppConfig {

    // @Value相当于 <property name="username" value="${db.username}"/>
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;

    // 该bean是为了解析@Value中SpringEL表达式
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DataSource dataSource() {
        return new DataSource(username, password, url);
    }
}
