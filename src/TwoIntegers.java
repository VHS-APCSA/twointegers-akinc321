
public class TwoIntegers
{
	private int num1;
	private int num2;
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic()
	{
		String str = "";
		str += "Addition: " + (num1 + num2) + "\n";
		str += "Subtraction: " + (num1 - num2) + "\n";
		str += "Product: " + (num1 * num2) + "\n";
		str += "Quotient: " + (num1 / num2);
		return str;
	}
	public String comparingIntegers()
	{
		String str = "";
		if(num1 > num2)
		{
			str += num1 + " is greater than " + num2;
		}
		else if(num2 > num1)
		{
			str += num2 + " is greater than " + num1;
		}
		else
		{
			str += num1 + " is equal to " + num2;
		}
		return str;
	}
	public String oddOrEven()
	{
		String str = "";
		if(num1 % 2 == 0)
		{
			str += num1 + " is even.\n";
		}
		else
		{
			str += num1 + " is odd.\n";
		}
		if(num2 % 2 == 0)
		{
			str += num2 + " is even.";
		}
		else
		{
			str += num2 + " is odd.";
		}
		return str;
	}
	public String multiples()
	{
		String str = "";
		if(num1 % num2 == 0)
		{
			str += num2 + " is a multiple of " + num1;
		}
		else
		{
			str += num2 + " is not a multiple of " + num1;
		}
		return str;
	}
}
