package com.example.mapper;
import com.example.pojo.HbFlight;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface HbFlightMapper {
    /**
     * 查询航班信息列表
     * @return
     */
    List<HbFlight> findHbFlightList();
}
