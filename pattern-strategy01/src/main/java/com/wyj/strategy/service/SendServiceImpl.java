package com.wyj.strategy.service;

import com.wyj.strategy.context.SendMessageContext;
import com.wyj.strategy.pattern.processor.SendInformThePersonMessage;
import com.wyj.strategy.pattern.processor.SendMailMessage;
import com.wyj.strategy.pattern.processor.SendPhoneMessage;
import com.wyj.strategy.pattern.processor.SendSmsMessage;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService {

    @Override
    public String send(Integer sendType) {
        SendMessageContext context = null;
        switch (sendType) {
            case 1:
                context = new SendMessageContext(new SendSmsMessage());
            case 2:
                context = new SendMessageContext(new SendMailMessage());
            case 3:
                context = new SendMessageContext(new SendInformThePersonMessage());
            case 4:
                context = new SendMessageContext(new SendPhoneMessage());
            default:
                context = new SendMessageContext(new SendSmsMessage());
        }
        return context.processor(sendType);
    }

}
