package com.example.publisherapi;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class PublisherApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublisherApiApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
