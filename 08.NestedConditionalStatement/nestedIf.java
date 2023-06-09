/*
In Nested if statement ,the if statement can conatin a if or if-else if-else inside another if or else-if
statement and even in else statement */
public class nestedIf
{
	public static void main(String[] args)
	{
		/*syntax
			if(condition1)
			{
				statement1;
				if(nestedInside--Condition1)
				{
					statement2;
				}
			}
		*/
		String address="Delhi,India";
		if(address.endsWith("India"))
		{
			if(address.contains("Merrut"))
			{
				System.out.println("City is Merrut");
			}
			else if(address.contains("Delhi"))
			{
				System.out.println("City is Delhi");
			}
		}
		else
		{
			System.out.println("Another country");
		}
	}
}