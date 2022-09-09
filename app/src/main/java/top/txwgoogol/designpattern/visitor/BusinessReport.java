package top.txwgoogol.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

import top.txwgoogol.designpattern.visitor.model.Visitor;

/**
 * 员工业务报表
 * Created by txwgoogol on 2018/1/20.
 */
public class BusinessReport {
    List<Staff> mStaff = new LinkedList<>();

    public BusinessReport() {
        mStaff.add(new Manager("王经理"));
        mStaff.add(new Engineer("工程师-Shawn.Xiong"));
        mStaff.add(new Engineer("工程师-Kael"));
        mStaff.add(new Engineer("工程师-Chaossss"));
        mStaff.add(new Engineer("工程师-Tiiime"));
    }

    /**
     * 为访问展示报表
     *
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaff) {
            staff.accept(visitor);
        }
    }

}
