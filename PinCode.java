import java.util.regex.Pattern;
import java.util.Scanner;

public class PinCode{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);

		String pattern="[0-9]{6}";
		String value=s.next();
		System.out.println(Pattern.matches(pattern,value));
		
		
		
	}
}