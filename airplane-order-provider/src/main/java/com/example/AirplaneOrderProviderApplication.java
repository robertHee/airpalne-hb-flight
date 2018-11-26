package com.example;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class AirplaneOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirplaneOrderProviderApplication.class, args);
    }
}
