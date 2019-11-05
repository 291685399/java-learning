package com.wyj.strategy.service;

import com.wyj.strategy.context.SendMessageContext;
import com.wyj.strategy.pattern.AbstractSendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService {

    @Autowired
    private SendMessageContext sendMessageContext;

    @Override
    public String send(Integer sendType) {
        AbstractSendMessage instance = sendMessageContext.getInstance(sendType);
        return instance.processor(sendType);
    }

}
