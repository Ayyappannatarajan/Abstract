package org.test;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Employees {
	private int id;
	private String name;
	private long phno;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public void setEmail(String email) {
		this.email = email;
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
