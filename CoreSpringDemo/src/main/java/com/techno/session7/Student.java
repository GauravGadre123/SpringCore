package com.techno.session7;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("std")
@Scope("prototype")
public class Student {
	
	@Value("gaurav")
	String name;

	@Value("101")
	int id;

	@Value("#{list1}")
	List<String> names;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", names=" + names + "]";
	}
	
	

}
