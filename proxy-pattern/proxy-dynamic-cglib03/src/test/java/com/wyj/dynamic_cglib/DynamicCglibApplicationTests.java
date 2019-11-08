package com.wyj.dynamic_cglib;

import com.wyj.dynamic_cglib.cglib.CglibProxy;
import com.wyj.dynamic_cglib.service.InternetCatesServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DynamicCglibApplicationTests {

    @Test
    public void contextLoads() {
        // 生成 Cglib 代理类
        InternetCatesServiceImpl proxy = (InternetCatesServiceImpl) CglibProxy.getProxy(new InternetCatesServiceImpl());
        // 调用需代理的方法
        String time = "2019-11-07 18:00:00";
        Integer index = 39;
        proxy.internet(time, index);
    }

}
