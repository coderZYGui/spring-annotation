package com.zy.config;

import com.zy.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/11 08:35
 */

/*
    自动装配:
        Spring利用依赖注入(DI), 完成对IoC容器中各个组件的依赖关系赋值;

    1、@Autowired: 自动注入
        1): 默认优先按照 类型 去容器中找到对应的组件: applicationContext.getBean(BookDao.class); 找到就给bookDao赋值
        2): 如果找到多个相同类型的组件,再将属性的名称作为组件的id去容器中查找
                           applicationContext.getBean("bookDao")
        3): @Qualifier("bookDao"): 使用@Qualifier指定需要装配的组件的id, 而不是使用属性名
        4): 自动装配默认一定要将属性赋值好,否则就会报错; 可以使用@Autowired(required=false),如果没有找到对应要注入的bean,也不会报错
        5): @Primary: 让Spring优先选择装配标注该注解的bean; 也可以继续使用@Qualifier指定需要装配的bean的名字

        BookService {
            @Autowired
            BookDao bookDao;
        }
 */

@Configuration
@ComponentScan({"com.zy.service", "com.zy.dao", "com.zy.controller"})
public class MainConfigOfAutowired {


    @Bean
    public BookDao bookDao2() {
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }
}
