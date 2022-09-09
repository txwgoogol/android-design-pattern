package com.txw.designpattern.strategy;

import org.junit.Test;

import top.txwgoogol.designpattern.strategy.BusStrategy;
import top.txwgoogol.designpattern.strategy.CalculatorStrategy;

/**
 * 公交价格计价器
 * Created by txwgoogol on 2018/1/8.
 */
public class TrafficCalculator {

    CalculatorStrategy mCalculatorStrategy;

    public void setStrategy(CalculatorStrategy strategy) {
        this.mCalculatorStrategy = strategy;
    }

    public int calculatePrice(int km){
        return mCalculatorStrategy.calculatorPrice(km);
    }

    @Test
    public void main() {
        TrafficCalculator trafficCalculator = new TrafficCalculator();
        //设置计算策略
        trafficCalculator.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("共卡车乘16公里的价格"+trafficCalculator.calculatePrice(16));
    }

}
