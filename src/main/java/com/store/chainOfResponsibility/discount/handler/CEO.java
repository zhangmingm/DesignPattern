package com.store.chainOfResponsibility.discount.handler;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2020年08月22日 23:21
 * @Description: CEO 处理0.5及以下的折扣
 */
public class CEO extends DiscountHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.5){
            System.out.format("%s批准折扣为:%.2f%n",getHandlerName(),discount);
        }else{
            System.out.format("折扣%.2f,超出了最高领导%s的范围，不能被处理，交易结束%n",discount,getHandlerName());
        }
    }
}
