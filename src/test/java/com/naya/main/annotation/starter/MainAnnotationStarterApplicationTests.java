package com.naya.main.annotation.starter;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainAnnotationStarterApplicationTests {
    private ApplicationContext context;


    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(ConfigStarter.class);
    }

}
