package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "欢迎")
@RestController
@RequestMapping
public class WelcomeController {

    @Operation(summary = "欢迎页面")
    @GetMapping
    public String welcome() {
        return "Spring Boot Multiple Rabbit MQ";
    }
}
