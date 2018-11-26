package com.example.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.config.HbAlipayConfig;
import com.example.pojo.HbPay;
import com.example.service.HbAliPayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class HbAliController {

    @Reference(check = false)
    private HbAliPayService hbAliPayService;

    @Resource
    private HbAlipayConfig hbAlipayConfig;


    @RequestMapping(value = {"/hbAliPay","/"})
    public String hbUserListDisplay(Model model){
        List<HbPay> hbPaysList = hbAliPayService.findPayList();
        // 保存数据
        model.addAttribute("hbPaysList",hbPaysList);
        // 跳转到模板页面
        return "hbAliPayIndex";
    }



}
