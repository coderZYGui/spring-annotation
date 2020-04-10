package com.zy._05_import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 10:34
 */

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
        return new DataSource();
    }
}
