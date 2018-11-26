package com.example.mapper;
import com.example.pojo.HbPay;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HbPayMapper {

    /**
     *查询支付成功的列表
     * @return
     */
    public  List<HbPay> findPayList();

}
