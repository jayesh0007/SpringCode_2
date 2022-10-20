package com.aop.dlf.secondexample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {
	
	@Autowired
	private Employee emp;
	
	@Before("execution(public void working())")
	public void wishing() {
		System.out.println("Good Day!!");
	}

	@After("execution(public void working())")
	public void displayCompanyName() {
		String ecname =  emp.getId();
		if(ecname.contains("IBM")) {
			System.out.println("IBM");
		}
		else if(ecname.contains("YashTech")) {
			System.out.println("Yash Technologies");
		}
		else {
		}
	}
	
	@AfterReturning(pointcut = "execution(public int calculate*(..))",returning="ans")
	public void calculating(int ans) {
		System.out.println("Calculated!!"+ans);
	}

	@AfterThrowing(pointcut = "execution(public void badmein())",throwing="ex")
	public void badmein(MyException ex) {
		System.out.println("From Aspect:");
		System.out.print(ex);
	}
}
