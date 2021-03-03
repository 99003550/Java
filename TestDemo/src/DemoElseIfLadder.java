import java.util.Scanner;

public class DemoElseIfLadder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Marks");
	int marks=sc.nextInt();
	if(marks>=90)
	{
		System.out.println("A+ Grade");
	}
	else if(marks>=80)
	{
		System.out.println("A Grade");
	}
	else if (marks>=70)
	{
		System.out.println("B Grade");
	}
	else if (marks>=60)
	{
		System.out.println("B Grade");
	}
	else if (marks>=50)
	{
		System.out.println("B Grade");
	}
	else 
	{
		System.out.println("Failed");
	}
}
}
