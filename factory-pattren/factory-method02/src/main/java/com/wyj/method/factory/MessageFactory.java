package com.wyj.method.factory;

import com.wyj.method.enums.MessageEnum;
import com.wyj.method.service.MessageServer;
import com.wyj.method.utils.BeanTool;

public class MessageFactory extends AbstractMessageFactory {

    public MessageServer createSmsInstance() {
        return (MessageServer) BeanTool.getBean(MessageEnum.SMS.getClassName());
    }

    public MessageServer createMailInstance() {
        return (MessageServer) BeanTool.getBean(MessageEnum.MAIL.getClassName());
    }

    public MessageServer createPhoneInstance() {
        return (MessageServer) BeanTool.getBean(MessageEnum.PHONE.getClassName());
    }

}
