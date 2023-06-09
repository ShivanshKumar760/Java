/*
-We can have a name of each java for loop,to do so we use label before the declaration of for loop.
It is useful while using the nested for loop as we will see later on to break or continue a specific labeled loop.


Note:
-----
The break or continue keyword breaks or continue the innermost for loop only
until used with a label

Syntax:

labelName:
for(initialize_of_iterator;condition;updation_of_iterator)
{
	
}

*/

public class labelForLoop 
{
	public static void main(String[] args)
	{

		label1:
		for(int i = 1;i<=3;i++)
		{
			label2:
			for(int j = 1;j<=3;j++)
			{
				if (i==2 && j==2){break label1;}
				System.out.println(i+" "+j);
			}
		}
	

	}
}
