public class BreakExampleFor
{
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			if(i==3){break;}
			for(int j=1;j<=3;j++)
			{
				System.out.println(i+" "+j);
			}
		}
	}
}