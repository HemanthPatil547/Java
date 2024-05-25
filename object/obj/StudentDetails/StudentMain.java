package obj.StudentDetails;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args)
	{
		Students s= new Students();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Roll No");
		s.roll=sc.nextInt();
		System.out.println("Enter a Name ");
		s.Name = sc.next();
		System.out.println("Enter a Course :");
		s.Course=sc.next();
		System.out.println("Enter a 3 sub marks");
		s.m1=sc.nextInt();
		s.m2=sc.nextInt();
		s.m3=sc.nextInt();
		
		System.out.println(s.details());
		System.out.println("Total Marks is :"+s.total());
		System.out.println("Avg is "+s.avg());
		System.out.println("Grade is "+s.grade());
		sc.close();
		
		
		
	}

}
