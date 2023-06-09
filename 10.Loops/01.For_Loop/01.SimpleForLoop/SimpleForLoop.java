/*
simple for loop
A simple for loop is the same for as C/C++.We can inititalize the variable , check condition and increment or decrement value . It consist of four parts

i)Initialization
It is the initial part or condition for loop to get executed is to intialize a iterator or variable we can also use already initalized variable in it 

ii)condition:it is the second part of for loop in which we use a boolean expression condition based on iterator initialized to execute the loop till it is true 

iii)Increment/Decrement:It increments or decrements the variable value.It is an optional condition but it should be used to make program optimal

iv)Statement:The statement of the loop is executed each time unitl the condition becomes false
statement is a block of code 


-Syntax:
--------
for(initialize_of_iterator;condition;updation_of_iterator)
{
	
}


-Example:
---------
for(int i=0;i<10;i++)
{
	System.out.println(i);
}
*/
public class SimpleForLoop
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}