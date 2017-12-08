package com.example.ruiqin.annotationdemo.test;

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
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RxBusReact {
    String name() default "ruiqin";
}
