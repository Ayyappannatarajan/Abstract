package org.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlRead {
	public static void main(String[] args) throws JAXBException {
		xmlread();
	}
	
	public static void xmlread() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		Unmarshaller un = jb.createUnmarshaller();
		File f=new File("E:\\D new\\New folder\\API\\sample.xml");
		Object s = un.unmarshal(f);
		Employee e1=(Employee)s;
		System.out.println(e1.getId());
	}

}
