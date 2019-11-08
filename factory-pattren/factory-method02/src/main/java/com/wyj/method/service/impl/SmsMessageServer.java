package com.wyj.method.service.impl;

import com.wyj.method.service.MessageServer;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageServer implements MessageServer {

    @Override
    public String sendMessage(String msg) {
        return String.format("内容为' %s '的电短信发送成功", msg);
    }

}