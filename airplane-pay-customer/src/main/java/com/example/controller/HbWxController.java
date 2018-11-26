package com.example.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.config.HbWXPayConfig;
import com.example.pojo.HbPay;
import com.example.service.HbWxPayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class HbWxController {

    @Reference(check = false)
    private HbWxPayService hbWxPayService;

    @Resource
    private HbWXPayConfig hbWXPayConfig;

    @RequestMapping(value = {"/hbWliPay","/"})
    public String hbPayListDisplay(Model model){
        List<HbPay> hbPaysList = hbWxPayService.findPayList();
        // 保存数据
        model.addAttribute("hbPaysList",hbPaysList);
        // 跳转到模板页面
        return "hbWxPayIndex";
    }

}
