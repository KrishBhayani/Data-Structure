import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}
}