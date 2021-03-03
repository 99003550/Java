import java.util.Scanner;

public class DemoNestedIf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("eligible to donate blood");
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter weight");
		int weight=sc.nextInt();
		if(weight<=50)
		{
			System.out.println("Not eligible to donate blood due to less Weight");
		}
	}
	else 
		System.out.println("Not Eligible to donate blood");
}
}
