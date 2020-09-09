package json_practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadWriteJson {

	public static void main(String[] args) throws Exception, ParseException 
	{
		// TODO Auto-generated method stub
		
		ReadWriteJson.readJSON();
		
	}
		public static void  readJSON() throws IOException, ParseException
		{
			JSONParser parser= new JSONParser();
			FileReader reader= new FileReader("/Users/akhilmehnot/Anshul_Training/json_practice/src/json_practice/TestData.json");
			Object obj= parser.parse(reader);
			JSONArray userlist =(JSONArray) obj;
			System.out.println("user list is" + userlist);
		}
		
	}


