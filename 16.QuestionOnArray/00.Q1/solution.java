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
	public static int countOccurrences(int arr[],int number)
	{
		int count = 0;
		for (int i = 0; i < arr.length;i++)
		{
			if(arr[i]==number)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		// System.out.println(inputArray(arr));
		inputArray(arr);
		System.out.println("Array inputed is :");
		outputArray(arr);
		System.out.println("Enter a number for which needs to find the occurrence:");
		int num=sc.nextInt();
		System.out.println(countOccurrences(arr,num));


	}
}