package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final RabbitTemplate rabbitTemplate1;
    private final RabbitTemplate rabbitTemplate2;

    public MyService(@Qualifier("rabbitTemplate1") RabbitTemplate rabbitTemplate1,
                     @Qualifier("rabbitTemplate2") RabbitTemplate rabbitTemplate2) {
        this.rabbitTemplate1 = rabbitTemplate1;
        this.rabbitTemplate2 = rabbitTemplate2;
    }

    public void sendMessageToRabbit1(String msg) {
        rabbitTemplate1.convertAndSend("exchangeA", "routingKeyA", msg);
    }

    public void sendMessageToRabbit2(String msg) {
        rabbitTemplate2.convertAndSend("exchangeB", "routingKeyB", msg);
    }
}