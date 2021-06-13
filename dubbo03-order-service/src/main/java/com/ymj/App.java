package com.ymj;

import com.ymj.dubbo03_pay_api.service.IPayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        IPayService payService = (IPayService) classPathXmlApplicationContext.getBean("payService1");

        // 远程调用
        String rs = payService.pay("Test");
        System.out.println(rs);
    }
}
