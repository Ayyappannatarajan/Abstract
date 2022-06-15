package org.test1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonRead {
	public static void main(String[] args) throws IOException, org.json.simple.parser.ParseException {
		jsonRead1();
	}
	
	
	
	public static void jsonRead1() throws IOException, org.json.simple.parser.ParseException  {
		
		FileReader f =new FileReader("E:\\D new\\New folder\\API\\src\\test\\resources\\JSON\\sample.json");
		org.json.simple.parser.JSONParser j=new org.json.simple.parser.JSONParser();
	    Object obj = j.parse(f);
	    JSONObject jo= (JSONObject) obj;
	Object name = jo.get("name");
	System.out.println(name);
	Object objj = jo.get("age");
     System.out.println(jo.get("browser").toString());
     System.out.println(jo.get("version").toString());
     JSONArray ja=(JSONArray)objj ;
     for(Object x:ja) {
 
     } 
    
  
		

	}


	

}
