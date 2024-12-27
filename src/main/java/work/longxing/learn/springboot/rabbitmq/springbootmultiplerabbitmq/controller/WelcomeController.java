package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Spring Boot Multiple Rabbit MQ";
    }
}
