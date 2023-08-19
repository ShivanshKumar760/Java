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
	public static int uniqueNumber(int arr[])
	{
		int result=0;
		for (int i = 0; i < arr.length;i++)
		{

			for (int j = i+1; j < arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=-1;
					arr[j]=-1;
				}
				
			}
		}
		for (int j = 0; j < arr.length;j++)
			{
				if(arr[j]>0)
				{
					result=arr[j];
				}
			}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		inputArray(arr);
		System.out.println("Array inputed is :");
		outputArray(arr);
		
		// System.out.print("Enter the target:");
		// int target=sc.nextInt();
		int result=uniqueNumber(arr);
		System.out.println("Unique Number is :"+result);

	}
}