package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("publisher-api")
public interface PublisherProxy {

    @GetMapping("/init")
    int init();

    @GetMapping("/publisher")
    List<Publisher> getPublisherList();

    @GetMapping("/publisher/{id}")
    Publisher getPublisherById(@PathVariable("id") int id);

}
