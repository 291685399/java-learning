package com.wyj.strategy;

import com.wyj.strategy.enums.SendTypes;
import com.wyj.strategy.service.SendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Strategy04ApplicationTests {

    @Autowired
    private SendService sendService;

    @Test
    public void contextLoads() {
        String sendResult1 = sendService.send(SendTypes.SMS.getType());
        System.out.println(sendResult1);
        String sendResult2 = sendService.send(SendTypes.MAIL.getType());
        System.out.println(sendResult2);
        String sendResult3 = sendService.send(SendTypes.INFORM_THE_PERSON.getType());
        System.out.println(sendResult3);
        String sendResult4 = sendService.send(SendTypes.PHONE.getType());
        System.out.println(sendResult4);
    }

}
