package top.txwgoogol.designpattern.factory.factory_method;

/**
 * 具体工厂类
 * Created by txwgoogol on 2018/1/6.
 */
public class ConcreteFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            //通过反射获取实例
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }

}
