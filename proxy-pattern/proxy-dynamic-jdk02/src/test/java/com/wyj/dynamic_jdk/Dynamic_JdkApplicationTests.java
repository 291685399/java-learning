package com.wyj.dynamic_jdk;

import com.wyj.dynamic_jdk.proxy.IInternetCafes;
import com.wyj.dynamic_jdk.proxy.impl.InternetCafesProxy;
import com.wyj.dynamic_jdk.proxy.impl.InternetCatesServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Dynamic_JdkApplicationTests.class)
public class Dynamic_JdkApplicationTests {

    @Test
    public void contextLoads() {
        // 目标对象
        IInternetCafes target = new InternetCatesServiceImpl();
        // 创建代理对象
        IInternetCafes proxy = (IInternetCafes) new InternetCafesProxy(target).getProxyInstance();
        // 执行方法
        String time = "2019-11-07 18:00:00";
        Integer index = 39;
        proxy.internet(time, index);
    }

}
