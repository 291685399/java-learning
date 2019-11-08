package com.wyj.simple;

import com.wyj.simple.factory.MessageFactory;
import com.wyj.simple.service.MessageServer;
import com.wyj.simple.service.impl.SmsMessageServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleApplicationTests {

    @Test
    public void contextLoads() {
        MessageServer messageServer=MessageFactory.createMessageServer(1);
        System.out.println(messageServer.sendMessage("嘿嘿嘿"));
    }

}
