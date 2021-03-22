package jsonproject.jsonproject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadFromJsonFile {

	 public static void main(String[] args) throws IOException, ParseException, FileNotFoundException{
	        JSONParser jsonparser = new JSONParser();
	        FileReader reader = new FileReader(".\\jsonfile\\test.json");        
	        Object obj =jsonparser.parse(reader);
	        JSONArray testjsonobj = (JSONArray)obj;
	        testjsonobj.forEach(emp -> parseEmpObj((JSONObject)emp));
	        //JSONObject procs=(JSONObject)testjsonobj.get("proc");
	       /*
	        for (int i = 0; i < testjsonobj.size(); i++) {
	        	//JSONObject array=(JSONObject)testjsonobj.get("employee1");
	        	JSONObject procs=(JSONObject)testjsonobj.get("proc");
	        	String name = (String)procs.get("exepath");
	        	System.out.println(name);
	        }*/
	        //System.out.println(testjsonobj.size());
	        /*
	        Iterator<JSONObject> iterator = companyList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			*/
	        
	        //JSONObject testjsonobj1 = (JSONObject)array;
	        
	        /*for (int i = 0; i < array.size(); i++) {
	           
	            JSONObject exepath1=(JSONObject) array.get(i);
	            //String street=(String) exepath1.get("street");
	            //String city=(String) exepath1.get("city");
	            String city=(String) exepath1.get("firstname");
	            //System.out.println(street);
	            System.out.println(city);
	        }*/
	        
	    }
	 private static void parseEmpObj(JSONObject emp) {
		  JSONObject empObj = (JSONObject) emp.get("proc");
		
		  String exepath = (String) empObj.get("exepath");
		  
		  System.out.println("exepath: " + exepath);
		  
		 }

}


