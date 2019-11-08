package com.wyj.simple.factory;

import com.wyj.simple.enums.MessageEnum;
import com.wyj.simple.service.MessageServer;
import com.wyj.simple.utils.BeanTool;

public class MessageFactory {

    public static MessageServer createMessageServer(Integer sendType) {
        MessageServer messageServer = null;
        if (MessageEnum.SMS.getSendType() == sendType) {
            messageServer = (MessageServer) BeanTool.getBean(MessageEnum.SMS.getInstanceClassName(sendType));
        } else if (MessageEnum.MAIL.getSendType() == sendType) {
            messageServer = (MessageServer) BeanTool.getBean(MessageEnum.MAIL.getInstanceClassName(sendType));
        } else if (MessageEnum.PHONE.getSendType() == sendType) {
            messageServer = (MessageServer) BeanTool.getBean(MessageEnum.PHONE.getInstanceClassName(sendType));
        }
        return messageServer;
    }

}
