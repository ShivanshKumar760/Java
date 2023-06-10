public class BreakExampleInnerLoop
{
	public static void main(String[] args)
	{
		for(int i=1 ; i<=3 ; i++ )
		{
			for(int j=1 ; j<=3 ;j++)
			{
				if(i==2 && j==2){break;}
				System.out.println(i+" "+j);
				/*this loop will only terminate inner loop when i = 2 and j = 2 and then 
				shift to outer loop at a new iteration i = 3*/ 
			}
		}
	}
}