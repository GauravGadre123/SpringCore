package com.techno.session3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("com/techno/session3/springconfig.xml");
		Student bean = (Student)con.getBean("std");
		System.out.println(bean);
    }
}
