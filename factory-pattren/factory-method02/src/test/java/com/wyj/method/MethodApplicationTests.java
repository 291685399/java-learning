package com.wyj.method;

import com.wyj.method.factory.MessageFactory;
import com.wyj.method.service.MessageServer;
import com.wyj.method.service.impl.SmsMessageServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MethodApplicationTests {

    @Autowired
    private SmsMessageServer smsMessageServer;

    @Test
    public void contextLoads() {
        System.out.println(smsMessageServer.sendMessage("嘿嘿嘿"));
    }

}