package com.wyj.abstract_.factory;

import com.wyj.abstract_.service.MessageServer;

public abstract class AbstractMessageFactory {

    public abstract MessageServer createSmsInstance();

    public abstract MessageServer createMailInstance();

    public abstract MessageServer createPhoneInstance();

}
