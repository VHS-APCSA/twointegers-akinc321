import java.util.Scanner;

public class BasicMath
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first integer.");
		int num1 = input.nextInt();
		System.out.println("Enter your second integer.");
		int num2 = input.nextInt();
		System.out.println("Sum: " + (num1 + num2) + "\n");
		System.out.println("Difference: " + (num1 - num2) + "\n");
		System.out.println("Product: " + (num1 * num2) + "\n");
		System.out.println("Quotient: " + (num1 / num2) + "\n");
		if(num1 > num2)
		{
			System.out.println(num1 + " is larger.");
		}
		else if(num1 == num2)
		{
			System.out.println("These numbers are equal.");
		}
		else
		{
			System.out.println(num2 + " is larger.");
		}
	}
}