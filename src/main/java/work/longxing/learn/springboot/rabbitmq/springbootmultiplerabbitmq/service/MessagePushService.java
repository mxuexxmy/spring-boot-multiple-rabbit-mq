package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.consumer.MyService;

@Service
public class MessagePushService {

    @Autowired
    private MyService myService;



}
