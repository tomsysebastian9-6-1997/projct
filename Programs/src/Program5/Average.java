package Program5;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int arr[];
		int sum=0,avg;
		
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		arr=new int [num];
		System.out.println("Enter the marks of students");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		avg=sum/num;
		System.out.println(avg);
	}

}
