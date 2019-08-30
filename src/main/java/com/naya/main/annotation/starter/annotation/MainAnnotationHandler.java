package com.naya.main.annotation.starter.annotation;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;

public class MainAnnotationHandler implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    ApplicationContext context;

    @Override
    @SneakyThrows
    public void onApplicationEvent(ContextRefreshedEvent event) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = context.getBean(beanDefinitionName);
            Method[] methods = bean.getClass().getMethods();
            for (Method m : methods) {
                if (m.isAnnotationPresent(Main.class)) {
                    m.invoke(bean);
                }
            }
        }
    }
}
