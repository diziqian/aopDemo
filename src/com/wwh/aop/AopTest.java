package com.wwh.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopTest {
    public  static void  main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");

        AOPRunInterface  aopRun1 = (AOPRunInterface)ctx.getBean("AOPRunImpl1");
        AOPRunInterface aopRun2 = (AOPRunInterface)ctx.getBean("AOPRunImpl2");
        aopRun1.printHelloWorld();
        System.out.println();
        aopRun1.doPrint();

        System.out.println();
        aopRun2.printHelloWorld();
        System.out.println();
        aopRun2.doPrint();
    }
}
