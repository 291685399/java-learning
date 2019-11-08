package com.wyj.simple.service.impl;

import com.wyj.simple.service.MessageServer;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageServer implements MessageServer {

    @Override
    public String sendMessage(String msg) {
        return String.format("内容为' %s '的电短信发送成功", msg);
    }

}