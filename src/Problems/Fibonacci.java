package Problems;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num=20;
		int a=0,b=1;
		System.out.print(a+" , "+b+" , ");
		int n;
		for(int i=2;i<num;i++)
		{
			n=a+b;
			a=b;
			b=n;
			System.out.print(n+" , ");
		}
	}
}
