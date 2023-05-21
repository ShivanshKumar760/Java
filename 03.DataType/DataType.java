public class DataType 
{
	public static void main(String[] args) {
		byte  a=127;
		// byte b=128;
		System.out.println("The byte data type valued variable value is :"+a);
		// System.out.println(b);//this will give error as b is a byte data type and exceeds the max 
		//range 

		short c=10000;
		short d=-20000;


		System.out.println("The short data type variable value is :"+c);
		System.out.println("The short data type variable value is :"+d);


		int e=20000;
		System.out.println("The int data type variable value is :"+e);


		float f=1.0f;
		System.out.println("The float data type variable value is :"+f);


		double g=56789.999999785d;
		System.out.println("The double data type variable value is :"+g);


		
		long h=9223372036854775807l;
		System.out.println("The long data type variable value is :"+h);

		boolean i=true ;
		System.out.println("i is a :"+i);

		String name = new String("Aman");
		System.out.println("Name is :"+name);


		int[] marks=new int[2];
		marks[0]=97;
		marks[1]=88;
		System.out.println("marks a index 0 is :"+marks[0]);

	}
}