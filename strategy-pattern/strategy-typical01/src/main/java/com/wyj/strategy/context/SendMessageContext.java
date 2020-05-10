package com.wyj.strategy.context;

import com.wyj.strategy.pattern.AbstractSendMessage;
import org.springframework.stereotype.Component;

/**
 * 策略模式上下文信息，用于接收对应策略实现类并调用
 */
public class SendMessageContext {

    private AbstractSendMessage sendMessage;

    public SendMessageContext(AbstractSendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public String processor(Integer sendType) {
        return this.sendMessage.processor(sendType);
    }

}
