package string;

import java.util.Scanner;

public class TheStringJoiner {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 System.out.println("Enter The Name");
	String name1=scan.next();
	String name2=scan.next();
	System.out.println(joinStrings(name1,name2));
	
}
	
	
	
	
	public static String joinStrings(String str1, String str2)
	{
		return (str1+str2);
	}

}
