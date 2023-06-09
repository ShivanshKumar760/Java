/*
do-while loop
-----------------
The java do while loop is used to iterate over a part of the program several times.Use it if the number of iteration is unknown or number of iteration is not fixed and if you must have to 
execute the loop at least once.

do
{
	Statement1;
	..
	statementN;

	updation_for_iterator;

}while(condition);

dowhile loop always execute at least once*/

public class DOWhile 
{
	public static void main(String[] args) {
		int i=1;
		do 
		{
			System.out.println(i);
			i++;
		}while(i<20);
	}
}