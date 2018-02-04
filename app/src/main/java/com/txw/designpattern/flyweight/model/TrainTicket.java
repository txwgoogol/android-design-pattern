package com.txw.designpattern.flyweight.model;

import java.util.Random;

/**
 * 火车票
 * Created by txw on 2018/2/4.
 */
public class TrainTicket implements Ticket {

    public String from;//事发地
    public String to;//事发地
    public String bunk;//事发地
    public int price;//事发地

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买从 " + from + " 到 " + to + " 的 " + bunk + " 火车票 " + " ，价格：" + price);
    }

}
