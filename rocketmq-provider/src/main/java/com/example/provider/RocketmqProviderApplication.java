package com.example.provider;

import com.example.provider.service.ProducerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RocketmqProviderApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext run = SpringApplication.run(RocketmqProviderApplication.class, args);
        ProducerService producerService = (ProducerService) run.getBean("producerService");
        producerService.sendMessage();
    }

}
