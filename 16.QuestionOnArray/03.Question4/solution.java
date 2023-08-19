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

	public static boolean isSorted(int arr[])
	{
		boolean flag=false;
		//so if we need to tell if array is sorted or not the logic will be
		//arr[i]<arr[i+1]
		for (int i = 1; i < arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				flag=false;
				break;
			}
			else
			{
				flag=true;
				
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating a scanner class
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();//taking array size as input 
		int arr[]=new int[size];//creating array
		inputArray(arr);//calling array input function
		System.out.println("Array inputed is :");
		outputArray(arr);//printing array 

		System.out.println("Is array sorted:"+isSorted(arr));


	}
}