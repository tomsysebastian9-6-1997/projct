package Program8;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int x,y,z;
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		x=0;
		y=1;
		System.out.println("The fibonacci series is "+x);
		System.out.println("The fibonacci series is "+y);
		for(int i=0;i<=num;i++)
		{
			z=x+y;
			System.out.println("The fibonacci series is "+z);
			x=y;
			y=z;
		}
		
	}

}
