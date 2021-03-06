package com.wyj.method.service.impl;

import com.wyj.method.service.MessageServer;
import org.springframework.stereotype.Component;

@Component
public class MailMessageServer implements MessageServer {

    @Override
    public String sendMessage(String msg) {
        return String.format("内容为' %s '的邮件发送成功", msg);
    }

}