import java.util.regex.*;
import java.util.Scanner;

public class PinCode{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);

		String regex="^[0-9]{6}";
		Pattern p = Pattern.compile(regex); 
		
		
		Matcher m1=p.matcher("A54026");
		System.out.println("A54026 matches (true/false):"+m1.matches());
		
		
		
		
	}
}