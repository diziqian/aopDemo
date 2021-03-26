package com.wwh.aop;

public class AOPRunImpl1 implements AOPRunInterface {
    public  void  printHelloWorld() {
        System.out.println("Enter com.wwh.aop.AOPRunImpl1.printHelloWorld()");
    }

    public  void doPrint() {
        System.out.println("Enter com.wwh.aop.AOPRunImpl1.doPrint()");
    }
}
