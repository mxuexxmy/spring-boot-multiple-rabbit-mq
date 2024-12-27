package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitTemplateConfig {

    @Bean("rabbitTemplate1")
    public RabbitTemplate rabbitTemplate1(@Qualifier("connectionFactory1")
                                          org.springframework.amqp.rabbit.connection.ConnectionFactory cf1) {
        return new RabbitTemplate(cf1);
    }

    @Bean("rabbitTemplate2")
    public RabbitTemplate rabbitTemplate2(@Qualifier("connectionFactory2")
                                          org.springframework.amqp.rabbit.connection.ConnectionFactory cf2) {
        return new RabbitTemplate(cf2);
    }

}
