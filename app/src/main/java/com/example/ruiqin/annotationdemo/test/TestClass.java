package com.example.ruiqin.annotationdemo.test;

import com.ruiqin.annotation.test.BindPort;

import java.lang.reflect.Field;

/**
 * 类描述:
 *
 * @author : ruiqin.shen
 * @date : 2017/12/8
 */
public class TestClass {

    @BindPort()
    private String port;

    private int number;

    public void printInfo() {
        System.out.println("info is " + port);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取类
        Class c = Class.forName("BindPort");
        //实例化一个TestClass对象
        TestClass tc = (TestClass) c.newInstance();

        // 获取所有的属性
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(BindPort.class)) {
                BindPort port = field.getAnnotation(BindPort.class);
                field.setAccessible(true);
                field.set(tc, port.value());

            }

        }

        tc.printInfo();
    }


}
