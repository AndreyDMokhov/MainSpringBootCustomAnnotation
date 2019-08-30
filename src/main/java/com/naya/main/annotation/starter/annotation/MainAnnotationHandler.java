package com.naya.main.annotation.starter.annotation;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;

public class MainAnnotationHandler implements BeanPostProcessor {
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Method[] methods = bean.getClass().getMethods();
        for (Method method : methods) {
            Main annotation = method.getAnnotation(Main.class);
            if (annotation != null) {
              method.invoke(bean);
            }
        }
        return bean;
    }

}
