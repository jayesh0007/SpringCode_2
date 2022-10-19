package com.aop.aopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.aopconcept.services.PaymentService;
import com.aop.aopconcept.services.PaymentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/aopconcept/config.xml");
    PaymentService paymentservice = context.getBean("payment", PaymentService.class);
  
    paymentservice.makePayment();
    
    
    }
}
