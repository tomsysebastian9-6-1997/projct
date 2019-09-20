package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resume 
{

		String Name;
		String Age;
		String Degree;
		String Branch;
		String ContactNo;
		
		public void Read() throws IOException
		{
		System.out.println("Enter your Name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Name=br.readLine();
		System.out.println("Enter your age");
		Age=br.readLine();
		System.out.println("Enter your Degree");
		Degree=br.readLine();
		System.out.println("Enter your Branch");
		Branch=br.readLine();
		System.out.println("Enter your Contact Number");
		ContactNo=br.readLine();
		}
		public void Display()
		{
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
		System.out.println("Degree : "+Degree);
		System.out.println("Branch : "+Branch);
		System.out.println("Contact : "+ContactNo);
	
	}
}
