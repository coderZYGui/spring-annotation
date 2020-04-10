package com.zy.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 18:31
 */
// 判断是否Mac系统
public class MacOSXConditaion implements Condition {
    /**
     *
     * @param conditionContext :判断条件能使用的上下文(环境)
     * @param annotatedTypeMetadata : 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 是否Mac系统

        //1. 能获取到IoC使用的beanfactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //2. 获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        //3. 获取当前环境信息(封住系统的的环境信息等,虚拟机等信息)
        Environment environment = conditionContext.getEnvironment();
        //4. 获取到bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");
        if (property.contains("Mac OS X"))
            return true;

        return false;
    }
}
