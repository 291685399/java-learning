package com.wyj.abstract_;

import com.wyj.abstract_.factory.MessageFactory;
import com.wyj.abstract_.service.MessageServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AbstractApplicationTests {

    @Test
    public void contextLoads() {
        MessageFactory messageFactory = new MessageFactory();
        MessageServer smsInstance = messageFactory.createSmsInstance();
        System.out.println(smsInstance.sendMessage("嘿嘿嘿"));
    }

}
