package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.config;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitListenerConfig {

    @Bean("rabbitListenerContainerFactory1")
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory1(
            @Qualifier("connectionFactory1")
            org.springframework.amqp.rabbit.connection.ConnectionFactory cf1) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(cf1);
        // 可以按需设置并发消费者数量、Acknowledge 模式等
        factory.setConcurrentConsumers(1);
        factory.setMaxConcurrentConsumers(5);
        return factory;
    }

    @Bean("rabbitListenerContainerFactory2")
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory2(
            @Qualifier("connectionFactory2")
            org.springframework.amqp.rabbit.connection.ConnectionFactory cf2) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(cf2);
        // 可以按需设置
        factory.setConcurrentConsumers(1);
        factory.setMaxConcurrentConsumers(5);
        return factory;
    }

    @Bean
    public RabbitAdmin rabbitAdmin1(@Qualifier("connectionFactory1")
                                    org.springframework.amqp.rabbit.connection.ConnectionFactory cf1) {
        return new RabbitAdmin(cf1);
    }



    @Bean
    public RabbitAdmin rabbitAdmin2(@Qualifier("connectionFactory2")
                                    org.springframework.amqp.rabbit.connection.ConnectionFactory cf2) {
        return new RabbitAdmin(cf2);
    }


}
