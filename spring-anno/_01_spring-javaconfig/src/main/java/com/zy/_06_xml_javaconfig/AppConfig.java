package com.zy._06_xml_javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 10:48
 */
@Configuration
@ImportResource("classpath:applicationContext.xml")
public class AppConfig {

    @Bean
    public SomeBean someBean(OtherBean otherBean){
        SomeBean sb = new SomeBean();
        sb.setOtherBean(otherBean);
        return sb;
    }
}
