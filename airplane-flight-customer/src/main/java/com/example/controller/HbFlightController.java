package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.pojo.HbFlight;
import com.example.service.HbFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class HbFlightController {

    @Reference(check = false)
    private HbFlightService hbFlightService;


    @RequestMapping(value = {"/hbFlightIndex","/"})
    public String hbFlightListDisplay(Model model){

        List<HbFlight> hbFlightstList = hbFlightService.findHbFlightList();
        // 保存数据
        model.addAttribute("hbFlightstList",hbFlightstList);
        // 跳转到模板页面

        return "hbFlightIndex";
    }


}
