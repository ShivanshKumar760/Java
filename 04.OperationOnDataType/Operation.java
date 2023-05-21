public class Operation
{
	public static void main(String[] args)
	{
		int a=3;
		float b=3.0f;
		
		System.out.println(a+b);//so when we apply a operation on float and int together the result 
		//will be float 

		//so to turn the answer into int we use type casting

		int c=(int)b;
		System.out.println(a+c);
	}
}