package com.txw.designpattern.strategy;

/**
 * 公交车价格计算策略
 * Created by txw on 2018/1/8.
 */
public class BusStrategy implements CalculatorStrategy {

    /**
     * 北京公交车，十公里之内一元钱，超过十公里之后每加1元可乘5公里
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatorPrice(int km) {
        //超过十公里的总距离
        int extraTotal = km - 10;
        //超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        //超过距离对5公里取余
        int faction = extraFactor % 5;
        //价格计算
        int price = 1 + extraFactor * 1;
        return faction > 0 ? ++price : price;
    }

}
