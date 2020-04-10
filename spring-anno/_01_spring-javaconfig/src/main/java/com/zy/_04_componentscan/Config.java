package com.zy._04_componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description: Spring的配置类
 *
 * @author zygui
 * @date 2020/4/10 08:34
 */

@Configuration
// 可以完成Spring组件的自动扫描(默认情况下,会去扫描被标注的类的对应的包(及其子包中)的所有的类
//@ComponentScan(basePackages = "com.zy._04_componentscan") // 也可以自己指定扫描的范围
@ComponentScan
public class Config {

}
