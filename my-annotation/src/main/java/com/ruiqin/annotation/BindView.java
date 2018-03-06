package com.ruiqin.my_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/2/10
 * 版权所有：深圳市亿车科技有限公司
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BindView {
    public int id();

    public boolean click() default false;

}
