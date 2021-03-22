package jsonproject.jsonproject;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONFile {

	public static void main(String[] args) {
		JSONObject main = new JSONObject();
		// TODO Auto-generated method stub
		JSONObject emps = new JSONObject();
		emps.put("firstname", "Jason");
		emps.put("lastname", "Cox");
		emps.put("website", "www.jsonc.com");

		//JSONObject empObj = new JSONObject();
		main.put("employee1", emps);

		JSONObject emps2 = new JSONObject();
		emps2.put("firstname", "Amy");
		emps2.put("lastname", "Wang");
		emps2.put("website", "www.amw.com");
		  
		//JSONObject empObj2 = new JSONObject();
		main.put("employee2", emps2);
/*
		JSONArray empList = new JSONArray();
		empList.add(empObj);
		empList.add(empObj2);
		  */
		try(FileWriter file = new FileWriter(".\\jsonfile\\test1.json")){
		   file.write(main.toJSONString());
		   file.flush();
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
