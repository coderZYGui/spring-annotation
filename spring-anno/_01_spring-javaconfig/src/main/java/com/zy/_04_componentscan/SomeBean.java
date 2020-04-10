package com.zy._04_componentscan;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 08:21
 */
@Setter
@Getter
//@Component("somebean") // 设置该类作为Spring管理的组件
@Component
public class SomeBean {

    @Autowired // 将Spring通过@Component创建好的OtherBean的实例,注入到下面的属性中
    private OtherBean otherBean;
}
