package com.aop.dlf.secondexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Employee emp1 = con.getBean("employee", Employee.class);
        Employee emp2 = con.getBean("employee", Employee.class);
        
        emp1.setId("001_IBM");
        emp1.setName("Jayesh");
        emp1.working();
        System.out.println(emp1.calculateibm(5, 15));
        emp1.badmein();
        System.out.println("----------------------------------------");
        emp2.setId("001_YashTech");
        emp2.setName("Venkata");
        emp2.working();
        System.out.println(emp2.calculateyashtech(5, 15));
        emp2.badmein();

        
    }
}
