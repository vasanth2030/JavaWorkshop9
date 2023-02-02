package basicJava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//if else
//		System.out.println("Enter a number: ");
//		int num=sc.nextInt();
//		if(num%2==0)
//		{
//			System.out.println("Even number");
//		}
//		else
//		{
//			System.out.println("Odd number");
//		}
		
		//if else if ladder
//		System.out.println("Enter your marks: ");
//		int marks= sc.nextInt();
//		
//		if(marks>=85)
//		{
//			System.out.println("Grade A");
//		}
//		else if(marks>=75)
//		{
//			System.out.println("Grade B");
//		}
//		else if(marks>=65)
//		{
//			System.out.println("Grade C");
//		}
//		else if(marks>=55)
//		{
//			System.out.println("Grade D");
//		}
//		else if(marks>=45)
//		{
//			System.out.println("Grade E");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
		//switch case
		System.out.println("Enter a number between 1 and 7: ");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid input");
			break;
		}
		
		System.out.println("End of program");
		
	}
}
