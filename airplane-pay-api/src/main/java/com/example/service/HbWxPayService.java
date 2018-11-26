package com.example.service;

import com.example.pojo.HbPay;

import java.util.List;

public interface HbWxPayService {
    /**
     * 查询微信支付成功的订单列表
     * @return
     */
    public List<HbPay> findPayList();
}
