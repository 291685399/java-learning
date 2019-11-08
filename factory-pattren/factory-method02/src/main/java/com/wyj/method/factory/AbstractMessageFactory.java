package com.wyj.method.factory;

import com.wyj.method.service.MessageServer;

public abstract class AbstractMessageFactory {

    public abstract MessageServer createSmsInstance();

    public abstract MessageServer createMailInstance();

    public abstract MessageServer createPhoneInstance();

}
