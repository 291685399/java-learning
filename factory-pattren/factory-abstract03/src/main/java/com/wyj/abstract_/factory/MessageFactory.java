package com.wyj.abstract_.factory;

import com.wyj.abstract_.enums.MessageEnum;
import com.wyj.abstract_.service.MessageServer;
import com.wyj.abstract_.utils.BeanTool;

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
