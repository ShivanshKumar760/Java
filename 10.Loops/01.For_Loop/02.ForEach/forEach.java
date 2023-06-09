/*
for-each loop
-The for each loop is used to iterate over array basically it is used to traverse array or collection of data in java.It is easier to use than simple for loop beacuse we dont have to increment value and use subscript notation

It works on the basis of element and not the index.It returns element one by one in defined variable 

Syntax:
-----------
for(data_type_of_collection variable<iterator>_name : array_name<collection_name>)
{
	//statement;

}

Example:
-------
public class forEach
{
	public static void main(String[] args)
	{
		int arr[]={12,23,44,56,78};
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}

output:
-------
12
23
44
56
78
*/
public class forEach 
{
	public static void main(String[] args)
	{
		int arr[]={12,23,44,56,78};
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}