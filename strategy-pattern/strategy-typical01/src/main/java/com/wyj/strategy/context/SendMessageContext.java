package com.wyj.strategy.context;

import com.wyj.strategy.pattern.AbstractSendMessage;
import org.springframework.stereotype.Component;

public class SendMessageContext {

    private AbstractSendMessage sendMessage;

    public SendMessageContext(AbstractSendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public String processor(Integer sendType) {
        String result = this.sendMessage.processor(sendType);
        return result;
    }

}
