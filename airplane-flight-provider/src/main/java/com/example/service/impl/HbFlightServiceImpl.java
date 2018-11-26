package com.example.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.mapper.HbFlightMapper;
import com.example.pojo.HbFlight;
import com.example.service.HbFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Service(interfaceClass = HbFlightService.class)
public class HbFlightServiceImpl implements HbFlightService {

    @Autowired
    private HbFlightMapper hbFlightMapper;

    @Override
    public List<HbFlight> findHbFlightList() {

        return hbFlightMapper.findHbFlightList();
    }
}
