import java.util.Scanner;
public class TIRunner
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number:");
		num1 = input.nextInt();
		System.out.println("Enter your second number:");
		num2 = input.nextInt();
		TwoIntegers math = new TwoIntegers(num1, num2);
		System.out.println(math.arithmetic());
		System.out.println(math.comparingIntegers());
		System.out.println(math.oddOrEven());
		System.out.println(math.multiples());
		
	}
}
