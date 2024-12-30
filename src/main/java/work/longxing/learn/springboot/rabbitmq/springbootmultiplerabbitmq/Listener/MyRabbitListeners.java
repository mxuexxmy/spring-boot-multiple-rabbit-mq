package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.Listener;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyRabbitListeners {

    // 使用 connectionFactory1
    @RabbitListener(queuesToDeclare = @Queue(
            value = "queueA",
            durable = "true"
    ), containerFactory = "rabbitListenerContainerFactory1")
    public void handleMessageFromRabbit1(String msg) {
        System.out.println("Rabbit1 收到消息：" + msg);
    }

    // 使用 connectionFactory2
    @RabbitListener(queuesToDeclare = @Queue(
            value = "queueB",
            durable = "true"
    ), containerFactory = "rabbitListenerContainerFactory2")
    public void handleMessageFromRabbit2(String msg) {
        System.out.println("Rabbit2 收到消息：" + msg);
    }

}
