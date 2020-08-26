package com.store.chainOfResponsibility.discount.handler;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2020年08月22日 20:55
 * @Description: 折扣处理者抽象类。
 * 1 定义处理折扣的方法。
 * 2 获取责任链上每个处理者的名称
 * 3 设置责任链上的后继者
 */
public abstract class DiscountHandler {

    public DiscountHandler handler;

    /**
     * 设置后继者
     * @param handler
     */
    public void setHandler(DiscountHandler handler) {
        this.handler = handler;
    }

    /**
     * 获取当前处理者的名称
     * @return
     */
    public String getHandlerName(){
        String name=this.getClass().getSimpleName();
        return name;
    }

    /**
     * 折扣处理方法，接收折扣值，如果能处理，提示处理信息，否则交给后继者处理。
     * @param discount
     */
    public abstract void processDiscount(float discount);

}
