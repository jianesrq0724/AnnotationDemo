package com.example.ruiqin.annotationdemo.reflection;

import com.example.ruiqin.annotationdemo.bind.TestClass;
import com.ruiqin.annotation.test.BindAddress;
import com.ruiqin.annotation.test.BindPort;

import java.lang.reflect.Field;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/20
 */

public class TestReflection {

    public static void main(String[] args) {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.example.ruiqin.annotationdemo.bind.TestClass");
            //实例化一个TestClass对象
            TestClass tc = (TestClass) cls.newInstance();
            tc.printInfo();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }


    private static void getInfo() {
        //获取类
        Class cls = null;
        try {
            cls = Class.forName("com.example.ruiqin.annotationdemo.bind.TestClass");
            //实例化一个TestClass对象
            TestClass tc = (TestClass) cls.newInstance();

            // 获取所有的属性
            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {
                if (field.isAnnotationPresent(BindPort.class)) {
                    BindPort port = field.getAnnotation(BindPort.class);
                    field.setAccessible(true);
                    field.set(tc, port.value());
                }
                if (field.isAnnotationPresent(BindAddress.class)) {
                    BindAddress address = field.getAnnotation(BindAddress.class);
                    field.setAccessible(true);
                    field.set(tc, address.value());
                }
            }
            tc.printInfo();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
