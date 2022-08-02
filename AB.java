import java.util.*;

class CheckString
{

	int top = -1;
	char s[] = new char[100];
	int a=0;
	int b=0;

	public void push(char n)
	{
		if(top>=99)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			s[top]=n;
		}
	}

	public char pop()
	{
		if(top<=-1)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			char element = s[top];
			top--;
			return element;
		}
	}

	public void stringresult(int x)
	{
		for(int i=0;i<x;i++)
		{
			char element = pop();
			if(element == 'a')
			{
				a++;
			}
			else if (element=='b')
			{
				b++;
			}
		}
		if (a==b)
			{
				System.out.println("String valid");
			}
			else
			{
				System.out.println("String invalid");
			} 
	}
}
public class AB
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CheckString cs = new CheckString();
		System.out.println("Enter String");
		String I = sc.nextLine();
		int x = I.length();
		for (int j=0;j<x;j++) 
		{
			cs.push(I.charAt(j));
		}
		cs.stringresult(x);	
	}
}	

