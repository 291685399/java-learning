package com.wyj.strategy.pattern.processor;

import com.wyj.strategy.enums.SendTypes;
import com.wyj.strategy.pattern.AbstractSendMessage;
import org.springframework.stereotype.Component;

@Component
public class SendInformThePersonMessage implements AbstractSendMessage {

    @Override
    public String processor(Integer sendType) {
        // 当面通知
        return String.format("选择的通知方式为 %s", SendTypes.getDesc(sendType));
    }

}
