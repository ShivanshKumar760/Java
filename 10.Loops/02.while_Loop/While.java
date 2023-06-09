/*
while loop
-The java while loop is used to iterate over a peice of code several time . If the number of 
iteration is not fixed and only condition is known we use while loop

Syntax:
-----------

while(condition)
{
	//block of code;
	updation_for_iterator;
}
*/

public class While 
{
	public static void main(String[] args) {
		int i = 0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
}