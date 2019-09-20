package Program10;

import java.util.Scanner;

public class Economy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int run[];
		int bowl[];
		float econ[];
		float over;
				
		System.out.println("Enter the number of bowlers");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		run=new int[num];
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<num;i++)
		{
			run[i]=sc.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler");
		bowl=new int[num];
		for(int i=0;i<num;i++)
		{
			bowl[i]=sc.nextInt();
		}
		System.out.println("Economy of the bowlers is");
		econ=new float[num];
		for(int i=0;i<num;i++)
		{
			over=(float) bowl[i]/6;
			econ[i]=(float) run[i]/over;
			System.out.println(econ[i]);
		}
		float sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+econ[i];
		}
		float all=(float)sum/num;
		System.out.println("The overall economy of the teanm is "+all);
		int c=0;
		for(int i=0;i<num;i++)
		{
			if(econ[i]<all)
			{
				c++;
			}
		}
		System.out.println("The number of bowlers eligible are "+c);
	}

}
