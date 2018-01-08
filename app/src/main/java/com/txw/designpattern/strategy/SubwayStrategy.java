package com.txw.designpattern.strategy;

/**
 * 地铁车价格计算策略
 * Created by txw on 2018/1/8.
 */
public class SubwayStrategy implements CalculatorStrategy {

    /**
     * 6公里（含）内3元；6-12公里（含）4元；12-22公里（含）5元；22-32公里（含）6元。
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatorPrice(int km) {
        if (km < 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km <= 32) {
            return 6;
        }
        //其余距离均7元
        return 7;
    }

}
