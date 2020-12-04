package com.forttiori.planetsfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlanetsFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanetsFilterApplication.class, args);
    }

}
