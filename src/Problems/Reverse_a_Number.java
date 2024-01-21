package Problems;

import java.util.Scanner;

public class Reverse_a_Number 
{
	public static void main(String []args)
	{
	int n,m,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to reverse:");
	n=sc.nextInt();
	while(n>0)
	{
		m=n%10;
		sum=sum*10+m;
		n=n/10;
	}
	System.out.println("reversed number is :"+sum);
}
}