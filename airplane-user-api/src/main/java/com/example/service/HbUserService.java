package com.example.service;
import com.example.pojo.HbUser;
import java.util.List;

public interface HbUserService {

    /**
     * 查询航班用户列表信息
     * @return
     */
    List<HbUser> findHbUserList();
}
