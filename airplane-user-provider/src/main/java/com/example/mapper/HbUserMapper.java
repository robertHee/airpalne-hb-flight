package com.example.mapper;
import com.example.pojo.HbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HbUserMapper {
    /**
     * 查询航班用户列表信息
     * @return
     */
    List<HbUser> findHbUserList();
}
