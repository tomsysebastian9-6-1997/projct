package Program14;

import java.util.Scanner;

public class Ncr {
	public static void main(String[] args) {
		
		long n;
		long r;
		long s=1,s1=1,s2=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the value of r");
		r=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s*i;
		}
		for(int i=1;i<=r;i++)
		{
			s1=s1*i;
		}
		for(int i=1;i<=(n-r);i++)
		{
			s2=s2*i;
		}
		long sum;
		sum=s/(s1*s2);
		System.out.println("The NCR factor for given values is "+sum);
	}

}
