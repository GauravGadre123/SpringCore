package com.techno.session6;

public class Address 
{
	 String city;

	 String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {

		System.out.println("address setter called");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	 
	 

}
