package com.example.consumer.service;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author mopan.
 * @date 2022/2/18.
 */

@Component
@RocketMQMessageListener(topic = "java-rocketmq",consumerGroup = "${rocketmq.consumer.group}")
public class ConsumerService implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("收到的消息" + s);
    }

}
