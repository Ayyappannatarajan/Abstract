package org.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int id;
	private String name;
	private long phno;
	private String email;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPhno() {
		return phno;
	}
	public String getEmail() {
		return email;
	}

}
