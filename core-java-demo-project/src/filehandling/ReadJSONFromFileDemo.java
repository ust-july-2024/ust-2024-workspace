package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFromFileDemo {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("output.json");
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(fileReader);
			System.out.println("Student id : " + obj.get("studId"));
			System.out.println("Student name : " + obj.get("studName"));
			System.out.println("Student marks : " + obj.get("studMark"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
