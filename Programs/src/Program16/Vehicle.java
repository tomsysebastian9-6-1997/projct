package Program16;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int arr[];
		//int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the fare collected for each vehicles");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int c=0,c1=0;
		for(int i=0;i<n;i++)
		{
		if((arr[i]>50)&&(arr[i]>0))
		{
			c++;
		}
		else if(arr[i]>0)
		{
			c1++;
		}
		}
		System.out.println("Number of heavy vehicles "+c+" and the number of light weight vehicles is "+c1);
	}

}
