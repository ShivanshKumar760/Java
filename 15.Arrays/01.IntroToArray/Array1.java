import java.util.*;
public class Array1
{
	public static void main(String[] args) {
		char array[]=new char[5];//create a new heap memory for character array to store 5 character
		array[0]='a';
		array[1]='b';
		array[2]='c';
		array[3]='a';
		array[4]='d';
		Scanner sc = new Scanner(System.in);

		//System.out.println(array);
		for (int i=0; i<5; i++)
		{
			System.out.println(array[i]);
		}
		//Similarly we can create int array
		int[] array_2=new int[5];
		for (int i=0; i<5; i++)
		{
			array_2[i]=sc.nextInt();
		}
		for (int i=0; i<5; i++)
		{
			System.out.println(array_2[i]);
		}
	}
}