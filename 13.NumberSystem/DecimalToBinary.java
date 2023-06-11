import java.util.*;
public class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number :");
		int decimal_number = sc.nextInt();
		int ans = 0;
		int power10=0;


		while(decimal_number>0)
		{
			int rem=decimal_number%2;
			//System.out.println(rem);
			ans+=rem*(int)(Math.pow(10,power10));
			decimal_number/=2;
			power10+=1;

		}
		System.out.println(ans);

	}
}