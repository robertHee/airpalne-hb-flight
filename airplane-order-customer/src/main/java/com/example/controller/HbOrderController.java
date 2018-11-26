package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.pojo.HbOrder;
import com.example.service.HbOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HbOrderController {


        @Reference(check = false)
        private HbOrderService hbOrderService;

        @RequestMapping(value = {"/hbOderIndex","/"})
        public String cityListDisplay(Model model){
            List<HbOrder> hbOrdersList = hbOrderService.findHbOrderList();
            // 保存数据
            model.addAttribute("hbOrdersList",hbOrdersList);
            // 跳转到模板页面
            return "hbOderIndex";
        }
}
