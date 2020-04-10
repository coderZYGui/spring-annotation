package com.zy.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/10 20:07
 */

// 自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    /**
     *
     * @param annotationMetadata 当前标注@Import注解类的所有注解信息
     * @return 返回要导入到容器中的组件的全类名
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.zy.beans.Blue","com.zy.beans.Red"};
    }
}
