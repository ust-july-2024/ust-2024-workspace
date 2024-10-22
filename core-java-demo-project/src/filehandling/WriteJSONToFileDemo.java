package filehandling;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class WriteJSONToFileDemo {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("studId", 101);
		obj.put("studName", "abc");
		obj.put("studMark", 50);
		
		System.out.println(obj);
		
		// lets write the json obj to a file
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("output.json");
			fileWriter.write(obj.toJSONString(obj));
			System.out.println("JSON data sent to file...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
