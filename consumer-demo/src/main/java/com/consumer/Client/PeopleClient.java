package com.consumer.Client;

import com.consumer.consumer_pojo.People;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service" ,fallback = PeopleClientFallback.class)
public interface PeopleClient {
    @GetMapping("people/{id}")
    People queryById(@PathVariable("id") Integer id);
}
