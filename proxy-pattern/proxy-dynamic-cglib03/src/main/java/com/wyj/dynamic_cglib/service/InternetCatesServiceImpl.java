package com.wyj.dynamic_cglib.service;

public class InternetCatesServiceImpl {

    public final String INTERNET_CAFES_NAME = "三国网吧";

    public void internet(String time, Integer index) {
        System.out.println(String.format("我于%s在%s%s号机器上网", time, INTERNET_CAFES_NAME, index));
    }

}
