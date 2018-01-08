package com.txw.designpattern.strategy;

/**
 * 出租车计算策略
 * Created by txw on 2018/1/8.
 */
public class TaxiStrategy implements CalculatorStrategy {

    //private int time; //时间

    /**
     * 以上海出租车价格为例子
     * 0-3（含）公里 5-23时，14RMB；23-5时，18RMB
     * 3-15（含）公里 5-23时,2元/公里 23-5时,3元/公里
     * 15公里以上 5-23时,4元/公里 23-5时,5元/公里
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatorPrice(int km) {
        if (km > 0 && km <= 3) {
            //if (time > 5 && time <= 23) {
            return 14;
            //} else {
            //    return 18;
            //}
        } else if (km > 3 && km <= 15) {
            //if (time > 5 && time <= 23) {
            return 14 + km * 2;
            //} else {
            //    return 18 + km * 3;
            //}
        } else {
            //if (time > 5 && time <= 23) {
            return 14 + km * 4;
            //} else {
            //    return 18 + km * 5;
            //}
        }
    }

}
