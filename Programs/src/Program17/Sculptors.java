package Program17;

import java.util.Scanner;

public class Sculptors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int total;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		n=sc.nextInt();
		total=n+(n/5);
		System.out.println("Number of Sculptors can be made is "+total);
		
	}

}
