import java.util.Scanner;

public class DemoIf {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age of the candidate");
	int age=sc.nextInt();
	if(age==10)
	{
		System.out.println("eligible for vote");
	}
}
}
