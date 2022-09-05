import java.util.*;
class Digit
{
	static int digit(int x)
	{
		if(x<10)
		{
				return 1;
		}
		return 1+digit(x/10);
	}
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println(digit(a));
	}

}