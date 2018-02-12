package com.txw.designpattern.visitor;

import com.txw.designpattern.visitor.model.BusinessReport;
import com.txw.designpattern.visitor.model.CEOVisitor;
import com.txw.designpattern.visitor.model.CTOVisitor;
import com.txw.designpattern.visitor.model.ReportUtil;
import com.txw.designpattern.visitor.model.Staff;

import org.junit.Test;

/**
 * 访问者模式测试类
 * Created by txw on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("========== 给CEO看的报表 ==========");
        //设置访问者，当前CEO
        businessReport.showReport(new CEOVisitor());
        System.out.println("\n========== 给CTO看的报表 ==========");
        businessReport.showReport(new CTOVisitor());
    }

}
