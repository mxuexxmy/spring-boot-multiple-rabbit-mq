package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.consumer.MyService;

@Service
public class MessagePushService {

    @Autowired
    private MyService myService;

    public void sendMessage(String queue,String rabbitMq, String message) {
       if (rabbitMq.equals("rabbitmq1")) {
           myService.sendMessageToRabbit1(message);
       } else if (rabbitMq.equals("rabbitmq2")) {
           myService.sendMessageToRabbit2(message);
       }
    }



}
