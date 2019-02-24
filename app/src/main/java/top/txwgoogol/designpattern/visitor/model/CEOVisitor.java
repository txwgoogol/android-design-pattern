package top.txwgoogol.designpattern.visitor.model;

/**
 * CEO访问者，只关注业绩
 * Created by txwgoogol on 2018/1/20.
 */
public class CEOVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + " ,KPI :" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + " ,KPI :" + manager.kpi + " ,新产品数量" + manager.getProducts());
    }

}
