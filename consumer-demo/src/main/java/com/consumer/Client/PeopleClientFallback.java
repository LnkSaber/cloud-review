package com.consumer.Client;

import com.consumer.consumer_pojo.People;
import org.springframework.stereotype.Component;

@Component
public class PeopleClientFallback implements PeopleClient {
    @Override
    public People queryById(Integer id) {
        People people = new People();
        people.setName("查无此人");
        return people;
    }
}
