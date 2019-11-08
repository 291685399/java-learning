package com.wyj.static_;

import com.wyj.static_.proxy.IInternetCafes;
import com.wyj.static_.proxy.impl.InternetCafesServiceImplProxy;
import com.wyj.static_.proxy.impl.InternetCatesServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StaticApplicationTests {

    @Test
    public void contextLoads() {
        String time = "2019-11-07 18:00:00";
        Integer index = 39;

        IInternetCafes iInternetCafes = new InternetCatesServiceImpl();
        InternetCafesServiceImplProxy proxy = new InternetCafesServiceImplProxy(iInternetCafes);
        proxy.internet(time, index);
    }

}