package com.example.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.mapper.HbPayMapper;
import com.example.pojo.HbPay;
import com.example.service.HbWxPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = HbWxPayService.class)
public class HbWxPayServiceImpl implements HbWxPayService {

    @Autowired
    private HbPayMapper hbPayMapper;


    @Override
    public List<HbPay> findPayList() {
        return hbPayMapper.findPayList();
    }
}
