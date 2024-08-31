package exceptions;

public class Demo4 {

	public static void main(String[] args) {
		int option = 7;
		
		try {
			if(option > 5 || option < 1) {
				InvalidOptionException ioe = new InvalidOptionException(option);
				throw ioe;
			}	
		}catch(InvalidOptionException i) {
			System.out.println(i.getMessage());
		}
		
	}

}