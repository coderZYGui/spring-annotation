package com.zy._05_import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 10:40
 */
@Configuration
@Import({DataSourceConfig.class, RedisConfig.class})
public class AppConfig {
}
