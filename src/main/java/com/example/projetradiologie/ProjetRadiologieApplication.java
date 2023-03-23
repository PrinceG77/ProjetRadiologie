package com.example.projetradiologie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.projetradiologie.bean"})
public class ProjetRadiologieApplication {

    public static void main(String[] args) {
         SpringApplication.run(ProjetRadiologieApplication.class, args);

    }

}
