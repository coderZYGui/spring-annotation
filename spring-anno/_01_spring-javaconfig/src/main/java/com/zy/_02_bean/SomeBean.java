package com.zy._02_bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 08:21
 */
public class SomeBean {

    // 方式二: 配置init,destory  @PostConstruct,@PreDestroy

    @PostConstruct
    public void init() {
        System.out.println("SomeBean.init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("SomeBean.destory");
    }
}
