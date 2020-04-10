package com.zy.config;

import com.zy.beans.Person;
import com.zy.condition.MacOSXConditaion;
import com.zy.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 18:02
 */
// 满足当前条件,这个类中配置的所有bean注册才能生效: 对类进行统一设置
//@Conditional({MacOSXConditaion.class})
@Configuration
public class MainConfig2 {


    /*
        prototype: 多例的 : IoC容器启动 并不会去调用方法创建对象 放在容器中, 每次获取的时候才会调用方法创建对象;
        singleton: 单例的 : IoC容器启动会 调用方法创建对象 放到IoC容器中;
        request: 同一次请求创建一个实例
        session: 同一个session创建一个实例

        懒加载:
            单例bean: 默认在容器启动的时候创建对象;
            懒加载: 容器启动不创建对象,第一次使用(获取)Bean创建对象,并初始化
     */
    //@Scope("prototype")
    @Scope
    @Lazy //第一次使用Bean的时候创建,不使用则不创建(即使IoC容器启动了)
    @Bean
    public Person person(){
        System.out.println("给容器中添加Person...");
        return new Person("张三", 22);
    }

    /*
        @Conditional: 按照一定的条件进行判断,满足条件给容器中注册bean

        如果系统是windows, 给容器中注册("bill")
        如果系统是mac, 给容器中注册("linus")
     */
    // 配置到这个方法上,只对这个方法作条件判断: 如果满足,则这个方法注册的bean才能生效
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person1(){
        return new Person("Bill Gates", 62);
    }

    @Conditional({MacOSXConditaion.class})
    @Bean("linus")
    public Person person2(){
        return new Person("linus", 48);
    }
}
