package com.saber.service;

import com.saber.mapper.PeopleMapper;
import com.saber.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    public People queryById(Integer id){
//        try {
//            Thread.sleep(3000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return peopleMapper.selectByPrimaryKey(id);
    }
}
