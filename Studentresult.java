//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;
import java.lang.*;

class Studentresult 
{
		String name;
		int s_id;
		int marks1,marks2,marks3,marks4,marks5,marks6,marks7,marks8,marks9;
		int total1,total2,total3;
		float per1,per2,per3;

	void getdata() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of First student :");
		name = br.readLine();
		System.out.println("Enter the student ID :");
		s_id = Integer.parseInt(br.readLine());
		System.out.println("Enter the First subject marks out of 100 :");
		marks1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Second subject marks out of 100 :");
		marks2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Third subject marks out of 100 :");
		marks3 = Integer.parseInt(br.readLine());
        
		System.out.println("*******************************************************");

		System.out.println("Enter the name of Second student :");
		name = br.readLine();
		System.out.println("Enter the student ID :");
		s_id = Integer.parseInt(br.readLine());
		System.out.println("Enter the First subject marks out of 100 :");

		marks4 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Second subject marks out of 100 :");
		marks5 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Third subject marks out of 100 :");
		marks6 = Integer.parseInt(br.readLine());
		
		System.out.println("*******************************************************");
		
		System.out.println("Enter the name of Third student :");
		name = br.readLine();
		System.out.println("Enter the student ID :");
		s_id = Integer.parseInt(br.readLine());
		System.out.println("Enter the First subject marks out of 100 :");
		marks7 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Second subject marks out of 100 :");
		marks8 = Integer.parseInt(br.readLine());
		System.out.println("Enter the Third subject marks out of 100 :");
		marks9 = Integer.parseInt(br.readLine());
}

		void calculate()
		{
		total1= marks1+marks2+marks3;
		per1 = total1*100/300f;
		total2= marks4+marks5+marks6;
		per2 = total2*100/300f;
		total3= marks7+marks8+marks9;
		per3 = total3*100/300f;
		System.out.println ("Enter the name of First student = "+name);
		System.out.println ("Enter the Student ID = "+s_id);
		System.out.println ("Enter the First subject marks out of 100 :  = "+marks1);
		System.out.println ("Enter the Second subject marks out of 100 : = "+marks2);
		System.out.println ("Enter the Third subject marks out of 100 :  = "+marks3);
		System.out.println ("Total Marks = "+total1);
		System.out.println ("Percentage = "+per1+"%");
		System.out.println ("Enter the name of Second student = "+name);
		System.out.println ("Enter the Student ID = "+s_id);
		System.out.println ("Enter the First subject marks out of 100 :  = "+marks4);
		System.out.println ("Enter the Second subject marks out of 100 : = "+marks5);
		System.out.println ("Enter the Third subject marks out of 100 :  = "+marks6);
		System.out.println ("Total Marks = "+total2);
		System.out.println ("Percentage = "+per2+"%");
		System.out.println ("Enter the name of Third student = "+name);
		System.out.println ("Enter the First subject marks out of 100 :  = "+marks7);
		System.out.println ("Enter the Second subject marks out of 100 : = "+marks8);
		System.out.println ("Enter the Third subject marks out of 100 :  = "+marks9);
		System.out.println ("Total Marks = "+total3);
		System.out.println ("Percentage = "+per3+"%");
}

	public static void main(String[] args) throws IOException
	{
	Studentresult s = new Studentresult();
	s.getdata();
	s.calculate();
}
}

