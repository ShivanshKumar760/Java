import java.util.*;
public class Input
{
	public static void main(String[] args)
	{
		//to take input in java we use scanner class
		/*
		Java Scanner class allows us the user to take input from the user through console 
		It belongs to java.util package which is needed to be imported using import keyword

		Syntax :
		import java.util.*; //where * indicate import all components of java.util

		It is used to read input of primitive data type like int ,double,long,short,float,byte 
		and string 

		Syntax to create a constructor of scanner class or instance of scanner 
		----------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);


		Method in Scanner class to take input for different data type is :

		1)int  ---- nextInt()

		2)float ---- nextFloat()

		3)double ---- nextDouble()

		4)Byte  ---- nextByte()

		5)String ---- nextLine()

		6)boolean ---- nextBoolean()

		7)short ---- nextShort()*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Message:");
		String greet = sc.nextLine();
		System.out.print(greet);
		int num = sc.nextInt();

		int UpdateNum=num+2;

		System.out.println(UpdateNum);


	}
}