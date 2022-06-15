package org.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlWrite {
	public static void main(String[] args) throws JAXBException {
		xmlWrite();
	}
	
	public static void xmlWrite() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(Employees.class);
		Marshaller m = jb.createMarshaller();
		File f=new File("sample.xml");
		Employees e=new Employees();
		e.setId(15);
		e.setName("ayyappan");
		e.setPhno(1234567890l);
		e.setEmail("sabari@gmail.com");
		
		m.marshal(e, f);
		

	}

}
