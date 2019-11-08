package com.wyj.simple.contants;

import com.wyj.simple.service.impl.MailMessageServer;
import com.wyj.simple.service.impl.PhoneMessageServer;
import com.wyj.simple.service.impl.SmsMessageServer;

public class ClassContants {

    public static final String SMS_CLASS_NAME = (new StringBuilder()).append(Character.toLowerCase((SmsMessageServer.class.getSimpleName()).charAt(0))).append(SmsMessageServer.class.getSimpleName().substring(1)).toString();
    public static final String MAIL_CLASS_NAME = (new StringBuilder()).append(Character.toLowerCase((MailMessageServer.class.getSimpleName()).charAt(0))).append(MailMessageServer.class.getSimpleName().substring(1)).toString();
    public static final String PHONE_CLASS_NAME = (new StringBuilder()).append(Character.toLowerCase((PhoneMessageServer.class.getSimpleName()).charAt(0))).append(PhoneMessageServer.class.getSimpleName().substring(1)).toString();

}
