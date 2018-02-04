package com.txw.designpattern.flyweight.model;

import org.junit.Test;

/**
 * 享原模式测试类
 * Created by txw on 2018/1/12.
 */
public class Client {

    @Test
    public void main() {

        Ticket ticket01 = TicketFactory.getTicket("北京","青岛");
        ticket01.showTicketInfo("上铺");

        Ticket ticket02 = TicketFactory.getTicket("北京","青岛");
        ticket02.showTicketInfo("下铺");

        Ticket ticket03 = TicketFactory.getTicket("北京","青岛");
        ticket03.showTicketInfo("坐票");
    }

}
