import java.util.Scanner;

public class EvaluatePostfixExpression
{	
	static int top = 0;
	static int value = 0;
	static String postfixexpression = "546+*493/+*";
	static int nextcharcounter = -1;
	static int[] s = new int[postfixexpression.length()];
	static int operand2;
	static int operand1;

	public static char Getnextchar()
	{
		nextcharcounter++;
		return postfixexpression.charAt(nextcharcounter);
	}

	public static void Push(int temp)
	{
		if(top>=postfixexpression.length())
		{
			System.out.println("Stack Overflow");
			return;
		}
		
			top++;
			s[top]=temp;
	
	}

	public static int Pop()
	{
		if(top<=-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			top--;
			return s[top+1]; 
		}
	}

	static int Performoperation( int operand1, int operand2,char operator)
	{
		if(operator=='+')
		{
			return operand1+operand2;
		}
		else if(operator=='-')
		{
			return operand1-operand2;
		}
		else if(operator=='*')
		{
			return operand1*operand2;
		}
		else if(operator=='/')
		{
			return operand1/operand2;
		}
		else 
		{
			return 0;
		}
	}

	public static void main(String[] args) 
	{
 		while(true)
 		{
 			char temp = Getnextchar();

 			if(temp!='\0')
 			{
 				if(Character.isDigit(temp))
 				{
 					Push(Integer.parseInt(""+temp));
 				}
 				else
 				{
 					operand2=Pop();
 					operand1=Pop();
 					value = Performoperation(operand1, operand2, temp);
 					Push(value);
 					System.out.println(value);
 				}
 			}
 			else
 			{
 				int ans = Pop();
 				System.out.println(ans);
 				System.exit(0);
 			}
 		}
 	}
}