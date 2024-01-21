package Problems;

import java.util.Scanner;

public class Palindrom_Or_Not {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String to check palindrom:");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		if(s.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("string is not a palindrome");
	}
}
