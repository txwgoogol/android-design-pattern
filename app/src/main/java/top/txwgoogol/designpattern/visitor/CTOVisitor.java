package top.txwgoogol.designpattern.visitor;

import top.txwgoogol.designpattern.visitor.model.Visitor;

/**
 * Created by txwgoogol on 2018/1/20.
 */
public class CTOVisitor implements Visitor {

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + " ，产品数量" + manager.getProducts());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + " ，代码行数" + engineer.getCodeLines());
    }

}
