package program2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Amstrong {
	static int num,temp;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n =0,sum=0;
		int c=0,p;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num=sc.nextInt();
		temp=num;
		
			while(num>0)
			{
				n=num%10;
				c++;
				num=num/10;
			}
			num=temp;
			while(num>0)
			{
				n=num%10;
				p=(int) Math.pow(n,c);
				//System.out.println(p);
				sum=sum+p;
				num=num/10;
			}
			if(sum==temp)
			{
				System.out.println("The given number is amstrong");
			}
			else
			{
				System.out.println("The given number is not amstrong");
			}
				
		}
	}

