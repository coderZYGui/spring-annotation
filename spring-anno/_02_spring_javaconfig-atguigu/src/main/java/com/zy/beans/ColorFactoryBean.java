package com.zy.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 20:31
 */

// 创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    // 返回一个Color对象,这个对象会添加到容器中
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean.getObject");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // 是否是单例: true, 在容器中只会保留一份
    @Override
    public boolean isSingleton() {
        return true;
    }
}
