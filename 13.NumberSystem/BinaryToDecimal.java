import java.util.Scanner;
public class BinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number:");
		int binary_num = sc.nextInt();
		int ans = 0;//to store converted decimal number
		int power=0;

		while(binary_num > 0)
		{
			int unit_digit=binary_num % 10;
			ans+=(unit_digit*Math.pow(2,power));
			binary_num/=10;
			power +=1;
		}
		System.out.println(ans);

	}
}