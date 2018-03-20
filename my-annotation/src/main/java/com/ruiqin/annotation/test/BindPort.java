package com.ruiqin.annotation.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类描述:
 *
 * @author : ruiqin.shen
 * @date : 2017/12/8
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BindPort {
    String value() default "8080";
}