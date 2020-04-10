package com.zy._08_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 12:04
 */
@Configuration
@PropertySource("classpath:db-dev.properties")
@Profile("dev")
public class DevConfig {

    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }
}
