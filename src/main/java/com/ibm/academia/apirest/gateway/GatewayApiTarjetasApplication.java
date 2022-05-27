package com.ibm.academia.apirest.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApiTarjetasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApiTarjetasApplication.class, args);
    }

}
