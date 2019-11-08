package com.wyj.static_.proxy.impl;

import com.wyj.static_.proxy.IInternetCafes;

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
