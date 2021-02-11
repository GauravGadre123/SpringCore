package com.techno.session9;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Student {
	
	@Value("gaurav")
	String name;

	@Value("101")
	int id;

	Address ad;

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

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", ad=" + ad + "]";
	}
	
	
	

}
