package com.wyj.strategy.service;

import com.wyj.strategy.enums.SendStrategyEnum;
import com.wyj.strategy.pattern.AbstractSendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public String send(Integer sendType) {
        Class<? extends AbstractSendMessage> clazz = SendStrategyEnum.getClazz(sendType);
        return applicationContext.getBean(clazz).processor(sendType);
    }

}
