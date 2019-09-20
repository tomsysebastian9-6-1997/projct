package Program6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int arr[];
		int c=0;
		
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		arr=new int [num];
		System.out.println("Enter the marks of students");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<=50)
			{
				c++;
			}
		}
		System.out.println("Number of students appearing for retest is "+c);
	}

}
