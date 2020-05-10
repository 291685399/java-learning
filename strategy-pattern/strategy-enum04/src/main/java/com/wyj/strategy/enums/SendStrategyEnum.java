package com.wyj.strategy.enums;

import com.wyj.strategy.pattern.AbstractSendMessage;
import com.wyj.strategy.pattern.processor.SendInformThePersonMessage;
import com.wyj.strategy.pattern.processor.SendMailMessage;
import com.wyj.strategy.pattern.processor.SendPhoneMessage;
import com.wyj.strategy.pattern.processor.SendSmsMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用于维护type与不同实现类之间的对应关系
 *
 * @Author wanyingjing
 * @Create 2020/5/10 1:20 AM
 */
@Getter
@AllArgsConstructor
public enum SendStrategyEnum {

    INFORM_THE_PERSON(3, SendInformThePersonMessage.class),
    MAIL(2, SendMailMessage.class),
    PHONE(4, SendPhoneMessage.class),
    SMS(1, SendSmsMessage.class);

    private Integer type;
    private Class<? extends AbstractSendMessage> clazz;

    public static Class<? extends AbstractSendMessage> getClazz(Integer type) {
        for (SendStrategyEnum strategyEnum : SendStrategyEnum.values()) {
            if (strategyEnum.getType().equals(type)) {
                return strategyEnum.getClazz();
            }
        }
        return null;
    }
}
