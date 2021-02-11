package com.techno.session9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Student student1 = (Student)con.getBean("std");
		System.out.println(student1);
		
		
    }
}
