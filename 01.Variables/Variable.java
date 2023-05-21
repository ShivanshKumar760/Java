public class Variable
{
	public static void main(String[] args)
	{
		//variable are the name storage container which refer to memory address of computer where value
		//is stored

		/*
		Syntax of variable declaration is:

		data_type variable_name=<value>;

		Now Main data type in java are :
		1.int 
		2.float
		3.string 
		4.char */

		int a=5;//now here value 5 is stored in variable a and a refer to a memory address
		float b=3.5f;
		char c='a';
		String d="hello";
		System.out.println(a);
		System.out.print(b+"\n");//print will not print a newline character thats why we have to 
		//add "\n" backslash n to tell javac to go to next line after printing b
		System.out.println(c);
		System.out.println(d);
	
	}
} 