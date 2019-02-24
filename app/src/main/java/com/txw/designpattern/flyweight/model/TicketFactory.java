package com.txw.designpattern.flyweight.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by txw on 2018/2/4.
 */
public class TicketFactory {

    static Map<String, Ticket> mTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (mTicketMap.containsKey(key)) {
            System.out.println("使用缓存 ==>" + key);
            return mTicketMap.get(key);
        } else {
            System.out.println("创建对象===>" + key);
            Ticket ticket = new TrainTicket(from, to);
            mTicketMap.put(key, ticket);
            return ticket;
        }
    }

}