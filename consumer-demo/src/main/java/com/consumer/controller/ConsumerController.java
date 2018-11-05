package com.consumer.controller;


import com.consumer.Client.PeopleClient;
import com.consumer.consumer_pojo.People;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private PeopleClient peopleClient;

    @GetMapping("{id}")
    public People queryById(@PathVariable("id") Integer id){
        return peopleClient.queryById(id);
    }

}
