package top.txwgoogol.designpattern.strategy;

/**
 * 价格计算接口
 * Created by txwgoogol on 2018/1/8.
 */
public interface CalculatorStrategy {

    /**
     * 按距离计算价格
     *
     * @param km 公里
     * @return 返回价格
     */
    int calculatorPrice(int km);

}
