package com.wyj.strategy.context;

import com.wyj.strategy.pattern.AbstractSendMessage;
import com.wyj.strategy.pattern.processor.SendInformThePersonMessage;
import com.wyj.strategy.pattern.processor.SendMailMessage;
import com.wyj.strategy.pattern.processor.SendPhoneMessage;
import com.wyj.strategy.pattern.processor.SendSmsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class SendMessageContext {

    private static Map<Integer, AbstractSendMessage> strategyMap;
    @Autowired
    private SendSmsMessage sendSmsMessage;
    @Autowired
    private SendMailMessage sendMailMessage;
    @Autowired
    private SendInformThePersonMessage sendInformThePersonMessage;
    @Autowired
    private SendPhoneMessage sendPhoneMessage;

    static {
        List<AbstractSendMessage> strategyList = new ArrayList(4);
        strategyList.add(new SendSmsMessage());
        strategyList.add(new SendMailMessage());
        strategyList.add(new SendInformThePersonMessage());
        strategyList.add(new SendPhoneMessage());
        strategyMap = strategyList.stream().collect(Collectors.toMap(AbstractSendMessage::getType, p -> p));
    }

    public AbstractSendMessage getInstance(Integer sendType) {
        return strategyMap.get(sendType);
    }

}
