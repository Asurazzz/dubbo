package com.ymj;

import org.apache.dubbo.container.Main;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext =
//                new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/application.xml"});
//        classPathXmlApplicationContext.start();
//        System.in.read();
        // dubbo提供的启动类方法，会启动dubbo配置的多个container
        Main.main(args);
    }
}
