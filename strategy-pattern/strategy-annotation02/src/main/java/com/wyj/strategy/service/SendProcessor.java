package com.wyj.strategy.service;

import com.google.common.collect.Maps;
import com.wyj.strategy.context.SendMessageContext;
import com.wyj.strategy.pattern.SendType;
import com.wyj.strategy.utils.ClassScaner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SendProcessor implements BeanFactoryPostProcessor {

    private Map<Integer, Class> sendTypeMap = Maps.newHashMapWithExpectedSize(4);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        ClassScaner.scan("com.wyj.strategy", SendType.class).forEach(clazz -> {
            String sendType = clazz.getAnnotation(SendType.class).value();
            sendTypeMap.put(Integer.valueOf(sendType), clazz);
        });
        SendMessageContext context = new SendMessageContext(sendTypeMap);
        beanFactory.registerSingleton(SendMessageContext.class.getName(), context);
    }

}