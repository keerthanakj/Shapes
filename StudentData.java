package myPkg;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentData {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String name;
		int age;
		float fee;
		char gen;
		
//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    //readLine() -> String
	    //read() -> ascii value
	    
	    System.out.println("Enter the name:");
	    name = br.readLine();
	    System.out.println("Enter the age:");
	    age = Integer.parseInt(br.readLine());
	    System.out.println("Enter the fee:");
	    fee = Float.parseFloat(br.readLine());
	    System.out.println("Enter the gender:");
	    gen = (char)br.read();
	    
	    System.out.println("Student Details:");
	    System.out.println("Name="+name);
	    System.out.println("Age="+age);
	    System.out.println("Fee="+fee);
	    System.out.println("Gender="+gen);
	    
	}

}
