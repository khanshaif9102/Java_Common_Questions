package Problems;

import java.util.Scanner;

public class Greatest_Common_Divisor 
{
	public static int findGCD(int a,int b) {
		while(b!=0)
		{
		int temp=b;
		b=a%b;
		a=temp;
		}
		return a;
	}
	public static void main(String []args)
	{
		int first,second;
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the first number:");
		first=sc.nextInt();
		System.out.println("entet the second number");
		second=sc.nextInt();
		int gcd=findGCD(first,second);
		System.out.println("the Greatest Common Divisor of "+first+" and "+second+" is :"+gcd);
		
	}
}
