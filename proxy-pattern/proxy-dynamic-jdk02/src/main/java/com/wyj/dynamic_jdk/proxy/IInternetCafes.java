package com.wyj.dynamic_jdk.proxy;

/**
 * 网吧
 */
public interface IInternetCafes {

    public final String INTERNET_CAFES_NAME = "三国网吧";

    /**
     * 上网
     *
     * @param time
     * @param index
     */
    void internet(String time, Integer index);

}
