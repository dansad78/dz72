package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController {

    @Autowired
    PublisherProxy proxy;

    @GetMapping("/init")
    public int init(){
        return proxy.init();
    }

    @GetMapping("/publisher")
    public List<Publisher> getPublisherList(){
     return proxy.getPublisherList();
    }

    @GetMapping("/publisher/{id}")
    public Publisher getPublisherById(@PathVariable("id") int id){
        return proxy.getPublisherById(id);
    }
}
