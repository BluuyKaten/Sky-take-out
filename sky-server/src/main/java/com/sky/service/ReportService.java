package com.sky.service;

import com.sky.vo.OrderReportVO;
import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 统计指定时间区间内的营业额数据
     * @param beginTime
     * @param endTime
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate beginTime,LocalDate endTime);

    /**
     * 统计指定时间区间内的用户数据
     * @param beginTime
     * @param endTime
     * @return
     */
    UserReportVO getUserStatistics(LocalDate beginTime, LocalDate endTime);

    /**
     * 订单指定时间区间内的订单数据
     * @param begin
     * @param end
     * @return
     * */
    OrderReportVO getOrdersStatistics(LocalDate begin, LocalDate end);
}
