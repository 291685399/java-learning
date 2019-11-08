package com.wyj.strategy.context;

import com.wyj.strategy.pattern.AbstractSendMessage;
import com.wyj.strategy.pattern.processor.SendInformThePersonMessage;
import com.wyj.strategy.pattern.processor.SendMailMessage;
import com.wyj.strategy.pattern.processor.SendPhoneMessage;
import com.wyj.strategy.pattern.processor.SendSmsMessage;
import com.wyj.strategy.utils.BeanTool;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class SendMessageContext {

    private Map<Integer, Class> sendTypeMap;

    public SendMessageContext(Map<Integer, Class> sendTypeMap) {
        this.sendTypeMap = sendTypeMap;
    }

    public AbstractSendMessage getInstance(Integer type){
        Class clazz = sendTypeMap.get(type);
        return (AbstractSendMessage)BeanTool.getBean(clazz);
    }

}
