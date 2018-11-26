package com.example;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class AirplanePayProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirplanePayProviderApplication.class, args);
    }
}
