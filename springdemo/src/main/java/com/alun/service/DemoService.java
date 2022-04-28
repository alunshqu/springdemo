package com.alun.service;

import com.alun.entity.Demo;
import com.alun.mapper.DemoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Transactional(rollbackFor = Exception.class)
    public void updateAgeAndName(Integer age, String userName) throws Exception{
        Demo demo = new Demo();
        demo.setId(1);
        demo.setAge(age);
        demoMapper.updateById(demo);
        updateName(userName);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateName(String userName) throws Exception{
        Demo demo = new Demo();
        demo.setId(1);
        demo.setUserName(userName);
        demoMapper.updateById(demo);
    }
}
