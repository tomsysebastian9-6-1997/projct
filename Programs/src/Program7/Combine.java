package Program7;

import java.util.Scanner;

public class Combine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=1;

		System.out.println("Enter the number alphabets in your name");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum*i;
		}
		System.out.println("The number of combination is "+sum);
	}

}
