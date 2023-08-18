import java.util.Arrays;
public class copyMethod
{
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int ar2[]=Arrays.copyOf(arr,2);
		System.out.println("Original array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Cloned array is :");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		ar2[1]=7;
		System.out.println("");
		System.out.println("Original array after change in clone array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Cloned array after change is :");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.print(ar2[i]+" ");

		}
	}
}