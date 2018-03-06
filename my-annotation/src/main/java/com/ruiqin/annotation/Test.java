package com.ruiqin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/6
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Test {

}
