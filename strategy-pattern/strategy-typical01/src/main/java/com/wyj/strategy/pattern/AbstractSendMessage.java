package com.wyj.strategy.pattern;

/**
 * 策略顶级接口/抽象类
 */
public abstract class AbstractSendMessage {

    abstract public String processor(Integer sendType);

}
