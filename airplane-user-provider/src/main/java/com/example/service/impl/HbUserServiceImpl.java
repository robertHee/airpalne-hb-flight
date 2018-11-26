package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.mapper.HbUserMapper;
import com.example.pojo.HbUser;
import com.example.service.HbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = HbUserService.class)
public class HbUserServiceImpl implements HbUserService {

    @Autowired
    private HbUserMapper hbUserMapper;

    @Override
    public List<HbUser> findHbUserList() {
        return hbUserMapper.findHbUserList();
    }
}
