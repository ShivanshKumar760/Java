/*
In Java,Switch Statement are similar to if-else if -else block of code .The switch statement
contains multiple blocks of code called case and a single case is executed based on the variable
which is being switched to.It also enhances the readability of the program.The switch statement
is easier to use instead of if - else.

POINTS TO REMEMBER:
--------------------
1.The case variable can be int , string , char , short , byte or enum/enumeration

2.case cannot be dubplicate 

3.default statement is executed when any of the case dosen't match the value of expression
It is optional.

4.Break Statement terminate the switch block when the condition is satisfied ,it is optional but 
should be used if not next case will be executed 

5.While using switch case we  must notice that the case expression will be of same type as of the
variable passed into switch() plus it will be a constant value .

Syntax:
switch(variable or expression)
{
	case value1:statement;break;
	case value2:statement;break;
	case value3:statement;break;
	case value4:statement;break;
		.
		.
		.
		.
		.
	case valueN:statement;break;
}

*/


public class SwitchStatement
{
	public static void main(String[] args)
	{
		int a = 3;
		switch(a)
		{
		case 1:
			System.out.println("One");break;
		case 2:
			System.out.println("Two");break;
		case 3:
			System.out.println("Three");break;
		default:
			System.out.println("Invalid Case");break;
		}
	}
}