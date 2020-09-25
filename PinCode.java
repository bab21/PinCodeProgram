import java.util.regex.*;
import java.util.Scanner;

public class PinCode{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);

		String regex="^[0-9]{6}$";
		Pattern p = Pattern.compile(regex); 
		
		
		Matcher m1=p.matcher("85402B");
		System.out.println("85402B matches (true/false):"+m1.matches());
		
		
		
		
	}
}