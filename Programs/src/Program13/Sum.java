package Program13;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Enter a number");
			num=sc.nextInt();
		}
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
	}

}
