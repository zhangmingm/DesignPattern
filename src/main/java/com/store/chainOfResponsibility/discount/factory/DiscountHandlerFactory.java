package com.store.chainOfResponsibility.discount.factory;

import com.store.chainOfResponsibility.discount.handler.CEO;
import com.store.chainOfResponsibility.discount.handler.DiscountHandler;
import com.store.chainOfResponsibility.discount.handler.Leader;
import com.store.chainOfResponsibility.discount.handler.Manager;
import com.store.chainOfResponsibility.discount.handler.Sales;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2020年08月22日 23:25
 * @Description: DiscountHandler 处理者工厂类
 */
public class DiscountHandlerFactory {

    public static DiscountHandler getDiscountHandler(){
        DiscountHandler saler=new Sales();
        DiscountHandler leader=new Leader();
        DiscountHandler manager=new Manager();
        DiscountHandler ceo=new CEO();
        saler.setHandler(leader);
        leader.setHandler(manager);
        manager.setHandler(ceo);
        return saler;
    }
}
