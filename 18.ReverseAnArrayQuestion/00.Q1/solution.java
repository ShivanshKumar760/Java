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
	public static int[] reverseArray(int arr[])
	{
		// int mx=Integer.MIN_VALUE;
		// int result=0;
		int ans[]=new int[arr.length];
		int secondArrayIndex=0;
		for (int i = arr.length-1; i>=0;i--)
		{
			ans[secondArrayIndex++]=arr[i];
		}
		
		return ans;
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
		// int result=secondMax(arr);
		int answerArray[]=reverseArray(arr);
		outputArray(answerArray);

	}
}