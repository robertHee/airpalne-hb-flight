package com.example.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.pojo.HbUser;
import com.example.service.HbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class HbUserController {

    @Reference(check = false)
    private HbUserService hbUserService;


    @RequestMapping(value = {"/HbUser","/"})
    public String hbUserListDisplay(Model model){
        List<HbUser> hbUsersList = hbUserService.findHbUserList();
        // 保存数据
        model.addAttribute("hbUsersList",hbUsersList);
        // 跳转到模板页面
        return "hbUserIndex";
    }

}
