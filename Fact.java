import java.util.*;
class Fact
{
	static int fact(int x)
	{
		if(x==0|| x==1)
		{
			return 1;
		}
		return fact(x-1)*x;
	}

	public static void main(String args[])
	{
		System.out.println("Enter n");
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=1;
		for (int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println(b +" " +fact(4));


	}
}