package com.lsj.test.starter;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    private static Logger logger = org.apache.log4j.Logger.getLogger(Provider.class);
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        classPathXmlApplicationContext.start();
        logger.debug("启动完毕");
        System.in.read();
    }
}
