package com.example.mapper;
import com.example.pojo.HbOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HbOrderMapper {
    /**
     * 查询订单信息列表
     * @return
     */
    public List<HbOrder> findHbOrderList();


}
