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
            3.1 当有多个OtherBean的实例时,可以使用 @Qualifier("bean的id")来指定
            3.2 有多个OtherBean时,在某个bean上添加 @Primary, 会优先注入该bean
            3.3 有多个OtherBean时,在参数列表中通过形参名称来指定对应的bean
     */

    @Bean
//    public SomeBean someBean(@Qualifier("otherBean") OtherBean ob) {
    public SomeBean someBean(OtherBean otherBean) {
        SomeBean sb = new SomeBean();
        sb.setOtherBean(otherBean);
        return sb;
    }

    @Bean
    //@Primary
    public OtherBean otherBean() {
        return new OtherBean("ob1");
    }

    @Bean
    public OtherBean otherBean2() {
        return new OtherBean("ob2");
    }
}
