package com.store.chainOfResponsibility.discount.handler;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2020年08月22日 23:13
 * @Description: 小组长处理0.15及以下的折扣
 */
public class Leader extends DiscountHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.15){
            System.out.format("%s批准折扣为:%.2f%n",getHandlerName(),discount);
        }else{
            System.out.format("折扣%.2f超出了%s的范围，交给他的领导处理%n",discount,getHandlerName());
            handler.processDiscount(discount);
        }
    }
}
