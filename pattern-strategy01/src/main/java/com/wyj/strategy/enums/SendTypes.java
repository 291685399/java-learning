package com.wyj.strategy.enums;

public enum SendTypes {

    SMS(1, "短信通知"),
    MAIL(2, "邮件通知"),
    INFORM_THE_PERSON(3, "当面通知"),
    PHONE(4, "电话通知");

    private Integer type;
    private String desc;

    private SendTypes(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDesc(Integer type) {
        SendTypes[] values = SendTypes.values();
        for (SendTypes sendType : values) {
            if (sendType.getType().equals(type)) {
                return sendType.getDesc();
            }
        }
        return null;
    }
}
