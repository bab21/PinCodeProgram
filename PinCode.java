import java.util.regex.*;
import java.util.Scanner;

public class PinCode{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);

		String regex="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		Pattern p = Pattern.compile(regex); 
		
		
		Matcher m1=p.matcher("854 020");
		System.out.println("854 020 matches (true/false):"+m1.matches());
		
		
		
		
	}
}