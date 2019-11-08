package com.wyj.strategy.context;

import com.wyj.strategy.pattern.AbstractSendMessage;
import com.wyj.strategy.pattern.processor.SendInformThePersonMessage;
import com.wyj.strategy.pattern.processor.SendMailMessage;
import com.wyj.strategy.pattern.processor.SendPhoneMessage;
import com.wyj.strategy.pattern.processor.SendSmsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMessageContext {

    @Autowired
    private SendSmsMessage sendSmsMessage;
    @Autowired
    private SendMailMessage sendMailMessage;
    @Autowired
    private SendInformThePersonMessage sendInformThePersonMessage;
    @Autowired
    private SendPhoneMessage sendPhoneMessage;

    public AbstractSendMessage getInstance(Integer sendType) {
        switch (sendType) {
            case 1:
                return sendSmsMessage;
            case 2:
                return sendMailMessage;
            case 3:
                return sendInformThePersonMessage;
            case 4:
                return sendPhoneMessage;
            default:
                return sendSmsMessage;
        }
    }

}
