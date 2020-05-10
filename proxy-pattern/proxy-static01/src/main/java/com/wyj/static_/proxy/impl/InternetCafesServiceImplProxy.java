package com.wyj.static_.proxy.impl;

import com.wyj.static_.proxy.IInternetCafes;

/**
 * 和IInternetCafes接口实现类InternetCatesServiceImpl继承同一个接口，在该类中定义被静态代理的逻辑
 */
public class InternetCafesServiceImplProxy implements IInternetCafes {

    private IInternetCafes iInternetCafes;

    public InternetCafesServiceImplProxy(IInternetCafes iInternetCafes) {
        this.iInternetCafes = iInternetCafes;
    }

    @Override
    public void internet(String time, Integer index) {
        System.out.println("上机");
        iInternetCafes.internet(time, index);
        System.out.println("下机");
    }

}
