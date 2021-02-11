package com.techno.session7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("com/techno/session7/springconfig.xml");
		Student student1 = (Student)con.getBean("std");
		System.out.println(student1.hashCode());
		
		Student student2 = (Student)con.getBean("std");
		System.out.println(student2.hashCode());
    }
}
