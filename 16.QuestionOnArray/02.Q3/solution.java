import java.util.*;
public class solution
{
	public static int[] inputArray(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void outputArray(int[] arr)
	{
		for (int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	public static int strictlyGreater(int arr[],int number)
	{
		int count=0;
		for (int i = 0; i < arr.length;i++)
		{
			if(arr[i]>number)
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		inputArray(arr);
		System.out.println("Array inputed is :");
		outputArray(arr);
		int num=5;
		System.out.println(strictlyGreater(arr,num));

	}
}