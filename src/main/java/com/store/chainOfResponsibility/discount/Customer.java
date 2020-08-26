package com.store.chainOfResponsibility.discount;

import com.store.chainOfResponsibility.discount.factory.DiscountHandlerFactory;
import com.store.chainOfResponsibility.discount.handler.DiscountHandler;

import java.util.Random;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2020年08月22日 23:28
 * @Description: 客户类。
 * 每个客户都有一个折扣处理者；
 * 每个客户都有一个获取折扣的方法
 *
 */
public class Customer {

    public DiscountHandler discountHandler;

    public void setDiscountHandler(DiscountHandler discountHandler) {
        this.discountHandler = discountHandler;
    }

    public void requestDiscount(float discount){
        discountHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        DiscountHandler dh= DiscountHandlerFactory.getDiscountHandler();
        Customer cu=new Customer();
        cu.setDiscountHandler(dh);
        Random rn=new Random();
        for (int i = 0; i < 50; i++) {
            cu.requestDiscount(rn.nextFloat());
            System.out.println("********************************************************");
        }
    }
}
