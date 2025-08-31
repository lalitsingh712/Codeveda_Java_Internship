import java.util.InputMismatchException;
import java.util.Scanner;
public class BasicCalculator
{
	
	public static double add(double a, double b)
	{
		return a+b;
	}
	public static double subtract(double a, double b)
	{
		return a-b;
	}
	public static double multiply(double a, double b)
	{
		return a*b;
	}
	public static double divide(double a, double b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Error: Division by zero is not allowed! ");
		}
		return a/b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean keepRunning = true;
		
		System.out.println("=======Welcome to Basic Calculator=========");
		while(keepRunning)
		{
			try
			{
				
				System.out.print("Enter first number: ");
				double num1 = sc.nextDouble();
			
				System.out.print("Enter second number: ");
				double num2 = sc.nextDouble();
			
				System.out.println("\nChoose Operation: ");
				System.out.println("1. Addition (+)");
				System.out.println("2. Subtraction (-)");		
				System.out.println("3. Multiplication (*)");		
				System.out.println("4. Division (/)");	
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				
				double result = 0;
		
		switch(choice)
		{
		case 1:
			result = add(num1, num2);
			System.out.println("Result = " + result);
			break;
		case 2:
			result = subtract(num1, num2);
			System.out.println("Result = " + result);
			break;
		case 3:
			result = multiply(num1, num2);
			System.out.println("Result = " + result);
			break;
		case 4:
			try
			{
			result = divide(num1, num2);
			System.out.println("Result = " + result);
			}catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 5:
			keepRunning = false;
			System.out.println("Exiting... Thank you for using the calculator!");
			break;
		default:
			System.out.println("Invalid choice! Please select between 1-5.");
		}
		
	}catch(InputMismatchException e)
			{
				System.out.println("Invalid input! Please enter number only.");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
