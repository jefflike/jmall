package com.jeff_code.jmall.service;

import com.jeff_code.jmall.bean.OrderInfo;

public interface IOrderService {
    // 保存订单方法的参数参数 orderInfo ,orderDetail
    String  saveOrder(OrderInfo orderInfo);

    // 获取流水号
/*    String getTradeNo(String userId);

    // 校验流水号
    boolean checkTradeCode(String userId, String tradeCodeNo);

    // 删除流水号
    void delTradeCode(String userId);

    // 验库存接口
    boolean checkStock(String skuId, Integer skuNum);*/
}