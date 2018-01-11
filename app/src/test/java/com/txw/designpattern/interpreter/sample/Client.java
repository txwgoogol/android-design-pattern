package com.txw.designpattern.interpreter.sample;

import org.junit.Test;

/**
 * Created by txw on 2018/1/11.
 */
public class Client {

    @Test
    public void main() {
        Calculator calculator = new Calculator("153 + 3589 + 118 - 555");
        System.out.println(calculator.calculate());
    }

}
