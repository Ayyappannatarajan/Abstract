package org.test1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test3 {
	public static void main(String[] args) throws IOException, ParseException {
		jsonRead();
	}
	
	
	public static void jsonRead() throws IOException, ParseException {
		FileReader path=new FileReader("E:\\D new\\New folder\\API\\src\\test\\resources\\JSON\\sample1.json");
		JSONParser jp=new JSONParser();
		Object obj = jp.parse(path);
		
		JSONObject jo=(JSONObject) obj;
		
Object ot = jo.get("employee");
String ot1 = ot.toString();
System.out.println(ot1);

JSONArray ja=(JSONArray) ot;
Object ob = ja.get(1);
System.out.println(ob);
for(Object h:ja) {
JSONObject jo1=(JSONObject) h;

Object w = jo1.get("lastname");
Object y = jo1.get("firstname");
System.out.println(w);
System.out.println(y);

}

	}

}
