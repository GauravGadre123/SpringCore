package com.techno.session3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	int id;
	String name;
	List<String> name1;
	Set<String> name2;
	Map<String, String> name3;
	Properties name4;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getName1() {
		return name1;
	}

	public void setName1(List<String> name1) {
		this.name1 = name1;
	}

	public Set<String> getName2() {
		return name2;
	}

	public void setName2(Set<String> name2) {
		this.name2 = name2;
	}

	public Map<String, String> getName3() {
		return name3;
	}

	public void setName3(Map<String, String> name3) {
		this.name3 = name3;
	}

	public Properties getName4() {
		return name4;
	}

	public void setName4(Properties name4) {
		this.name4 = name4;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3
				+ ", name4=" + name4 + "]";
	}

}
