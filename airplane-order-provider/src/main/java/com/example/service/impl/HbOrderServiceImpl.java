package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.mapper.HbOrderMapper;
import com.example.pojo.HbOrder;
import com.example.service.HbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Service(interfaceClass = HbOrderService.class)
public class HbOrderServiceImpl implements HbOrderService {

    @Autowired
    private HbOrderMapper hbOrderMapper;


    @Override
    public List<HbOrder> findHbOrderList() {
        return hbOrderMapper.findHbOrderList();
    }
}
