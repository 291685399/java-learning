package com.wyj.strategy.pattern.processor;

import com.wyj.strategy.enums.SendTypes;
import com.wyj.strategy.pattern.AbstractSendMessage;
import com.wyj.strategy.pattern.SendType;
import org.springframework.stereotype.Component;

@Component
@SendType("2")
public class SendMailMessage extends AbstractSendMessage {

    @Override
    public String processor(Integer sendType) {
        // 邮件通知
        return String.format("选择的通知方式为 %s", SendTypes.getDesc(sendType));
    }

}
