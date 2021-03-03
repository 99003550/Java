import java.util.Scanner;

import javax.lang.model.util.ElementScanner9;

public class DemoIfElse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	if((num%2)==0)
	{
	System.out.println("Even number");
	}
	else 
	{
		System.out.println("Odd number");
	}
}
}