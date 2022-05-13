package com.example.provider.service;

import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author mopan.
 * @date 2022/2/18.
 */
@Component("producerService")
public class ProducerService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送简单消息
     */
    public void sendMessage(){
        for(int i=0;i<10;i++){
            rocketMQTemplate.convertAndSend("java-rocketmq","rocketmq大爷，你好！"+i);
            rocketMQTemplate.convertAndSend("java-rocketmq","第二次发送" + i);
        }
        for (int i = 0; i < 5; i++) {
            rocketMQTemplate.convertAndSend("java-rocketmq","简单化");
        }
    }

}
