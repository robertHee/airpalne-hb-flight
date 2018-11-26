package com.example;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableDubboConfiguration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AirplaneFlightCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirplaneFlightCustomerApplication.class, args);
    }
}
