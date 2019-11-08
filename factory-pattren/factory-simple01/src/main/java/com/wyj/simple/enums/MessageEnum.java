package com.wyj.simple.enums;

import com.wyj.simple.contants.ClassContants;

public enum MessageEnum {

    SMS(1, ClassContants.SMS_CLASS_NAME),
    MAIL(2, ClassContants.MAIL_CLASS_NAME),
    PHONE(3, ClassContants.PHONE_CLASS_NAME);

    private Integer sendType;
    private String className;

    private MessageEnum(Integer sendType, String className) {
        this.sendType = sendType;
        this.className = className;
    }

    public Integer getSendType() {
        return sendType;
    }

    public String getClassName() {
        return className;
    }

    public String getInstanceClassName(Integer sendType) {
        MessageEnum[] instances = MessageEnum.values();
        for (MessageEnum instance : instances) {
            if (instance.getSendType() == sendType) {
                return instance.getClassName();
            }
        }
        return null;
    }
}
