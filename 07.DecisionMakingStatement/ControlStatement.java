/*
Java compiler executes the code from top to bottom.The statement in the code are executed by according
to the order in which they appear .However ,java Provides statement that can be used to control 
the flow of java code.Such statement are called as control statement in java or control flow 
statement in java.Its one  of the fundamental featue of java which provides a smooth flow of 
program


1)Decison Making statement in java
As the name suggests the decision making statement decide which statement to be executed and when
.Decision making statement evaluates the boolean expression ie true or false and control the flow 
of program depending upon the result of the condition provided.

There are two type of Decision making statements in java

1.if family(if , if-else , if -else if -else)
2.switch case 

I)if statement:

if(condition true)
{
	//evaluate the statement 
}


II)if - else

if(condition true)
{
	//evaluate the statement 
}
else
{
	//evaluates this other statement
}

III)if - else if -else 

if(condition1 true)
{
	//evaluate the statement 
}
else if (condition2 true)
{
	//evaluates this statement
}
else if (condition3 true)
{
	//evaluates this statement
}
else if (condition4 true)
{
	//evaluates this statement
}
.
.
.
.
.
else if (conditionn true)
{
	//evaluates this statement
}

else
{
	//evaluates this othernstatement
}





*/

public class ControlStatement
{
	public static void main(String[] args)
	{
		int num =10;
		if (num<10)
		{
			System.out.println("Number passed is less than 10");
		}
		else if (num==10)
		{
			System.out.println("Number passed is equal to 10");
		}
		else
		{
			System.out.println("Number passed is greater than 10");
		}
	}
}