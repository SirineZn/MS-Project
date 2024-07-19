package org.example.eventmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EventManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManagementSystemApplication.class, args);
    }

}