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
          2、通过调用需要注入的Bean的方式名()即可
          3、需要依赖的Bean,放入到参数列表中,会自动注入
     */

    @Bean
    public SomeBean someBean(OtherBean ob) {
        SomeBean sb = new SomeBean();
        sb.setOtherBean(ob);
        return sb;
    }

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }
}
