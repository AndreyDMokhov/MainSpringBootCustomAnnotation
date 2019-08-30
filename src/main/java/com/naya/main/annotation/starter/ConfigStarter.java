package com.naya.main.annotation.starter;

import com.naya.main.annotation.starter.annotation.MainAnnotationHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStarter {

    @Bean
    public MainAnnotationHandler mainAnnotationStarterApplication() {
        return new MainAnnotationHandler();
    }
}
