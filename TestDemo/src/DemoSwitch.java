import java.util.Scanner;

public class DemoSwitch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number <=4");
	int num=sc.nextInt();
	switch (num)
	{
	case 1: System.out.println("Case 1");
	break;
	case 2: System.out.println("Case 2");
	break;
	case 3: System.out.println("Case 3");
	break;
	case 4: System.out.println("Case 4");
	break;
	default: System.out.println("Invalid Input");
	break;
	}
}
}
