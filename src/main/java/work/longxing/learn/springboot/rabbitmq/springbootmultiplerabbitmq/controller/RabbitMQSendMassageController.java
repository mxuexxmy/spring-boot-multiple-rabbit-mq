package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.service.MessagePushService;

@Tag(name = "RabbitMQ 发送")
@RestController
@RequestMapping("/rabbitmq")
public class RabbitMQSendMassageController {

    @Autowired
    private MessagePushService messagePushService;

    @Operation(summary = "发送消息")
    @PostMapping("/sendMessage")
    public String sendMessage(String queue,String rabbitMq, String message) {
        messagePushService.sendMessage(queue,rabbitMq,message);
        return "success";
    }
}
