package com.wyj.dynamic_jdk.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InternetCafesProxy {

    private Object target;

    public InternetCafesProxy(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                // 这里也可以实现InvocationHandler接口，在invoke方法里面进行操作
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开机");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("下机");
                        return returnValue;
                    }
                });
    }

}
