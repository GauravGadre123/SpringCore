package com.techno.session9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Address getAddress() 
	{
		Address ad= new Address();
		 return ad;
		
	}
	
	
	@Bean(name = "std")
	public Student getStudent() 
	{
		Student st= new Student();
		st.setAd(getAddress());
		 return st;
		
	}
	
	
}
