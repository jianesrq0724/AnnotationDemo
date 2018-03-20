package com.example.ruiqin.annotationdemo.bind;

import com.ruiqin.annotation.test.BindAddress;
import com.ruiqin.annotation.test.BindPort;

/**
 * @version 1.0
 * @author：ruiqin.shen
 * @since：2018/2/26
 */

public class TestClass {
    @BindAddress("192.168.20.1")
    String address;
    @BindPort("8888")
    String port;


    public void printInfo() {
        System.out.println("info is " + address + ":" + port);
    }

}
