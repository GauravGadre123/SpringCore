package com.techno.session5;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
