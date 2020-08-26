package com.store.chainOfResponsibility.discount.handler;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2020年08月22日 21:02
 * @Description:一般销售人员，处理0.05及以下的折扣。
 */
public class Sales extends DiscountHandler {

    @Override
    public void processDiscount(float discount) {
        if(discount<=0.05){
            System.out.format("%s批准折扣为:%.2f%n",getHandlerName(),discount);
        }else{
            System.out.format("折扣%.2f超出了%s的范围，交给他的领导处理%n",discount,getHandlerName());
            handler.processDiscount(discount);
        }
    }
}
