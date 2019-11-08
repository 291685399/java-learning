package com.wyj.dynamic_jdk.proxy.impl;

import com.wyj.dynamic_jdk.proxy.IInternetCafes;

public class InternetCatesServiceImpl implements IInternetCafes {

    @Override
    public void internet(String time, Integer index) {
        System.out.println(String.format("我于%s在%s%s号机器上网", time, INTERNET_CAFES_NAME, index));
    }

}
