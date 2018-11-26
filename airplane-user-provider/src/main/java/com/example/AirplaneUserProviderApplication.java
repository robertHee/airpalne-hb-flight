package com.example;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@EnableDubboConfiguration
@SpringBootApplication
public class AirplaneUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirplaneUserProviderApplication.class, args);
    }
}
