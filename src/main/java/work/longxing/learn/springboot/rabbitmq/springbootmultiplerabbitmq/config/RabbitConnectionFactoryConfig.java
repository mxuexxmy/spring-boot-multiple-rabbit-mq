package work.longxing.learn.springboot.rabbitmq.springbootmultiplerabbitmq.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RabbitConnectionFactoryConfig {

    @Value("${spring.rabbitmq1.host}")
    private String rabbit1Host;

    @Value("${spring.rabbitmq1.port}")
    private int rabbit1Port;

    @Value("${spring.rabbitmq1.username}")
    private String rabbit1Username;

    @Value("${spring.rabbitmq1.password}")
    private String rabbit1Password;

    @Value("${spring.rabbitmq1.virtual-host:/}")
    private String rabbit1VirtualHost;

    @Value("${spring.rabbitmq2.host}")
    private String rabbit2Host;

    @Value("${spring.rabbitmq2.port}")
    private int rabbit2Port;

    @Value("${spring.rabbitmq2.username}")
    private String rabbit2Username;

    @Value("${spring.rabbitmq2.password}")
    private String rabbit2Password;

    @Value("${spring.rabbitmq2.virtual-host:/}")
    private String rabbit2VirtualHost;

    @Primary // 让该连接工厂成为默认
    @Bean("connectionFactory1")
    public ConnectionFactory connectionFactory1() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setHost(rabbit1Host);
        cachingConnectionFactory.setPort(rabbit1Port);
        cachingConnectionFactory.setUsername(rabbit1Username);
        cachingConnectionFactory.setPassword(rabbit1Password);
        cachingConnectionFactory.setVirtualHost(rabbit1VirtualHost);
        return cachingConnectionFactory;
    }

    @Bean("connectionFactory2")
    public ConnectionFactory connectionFactory2() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setHost(rabbit2Host);
        cachingConnectionFactory.setPort(rabbit2Port);
        cachingConnectionFactory.setUsername(rabbit2Username);
        cachingConnectionFactory.setPassword(rabbit2Password);
        cachingConnectionFactory.setVirtualHost(rabbit2VirtualHost);
        return cachingConnectionFactory;
    }

}
