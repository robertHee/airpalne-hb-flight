package com.example.service;
import com.example.pojo.HbOrder;
import java.util.List;

public interface HbOrderService {
    /**
     * 查询订单信息列表
     * @return
     */
    public List<HbOrder> findHbOrderList();

}
