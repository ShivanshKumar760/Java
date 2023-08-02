public class s 
{
	public static void main(String[] args)
	{
		String s="";
		String[] arr={"Hey","all","you"};
		for(String w:arr)
		{
			s=s+w;//1.Iteration Inside Memory block it will create a new string Hey
			//2.Iteration Since String is immutable in Java it will create a new string again Heyall
			//So total we have 3 copies of s variable in memory which are "" "Hey" and "Heyall"
			//3.Iteration it will create another variable s instance in memory with value as"Heyallyou"

		}
		StringBuilder sm=new StringBuilder("Hello");
		System.out.println(s);
		// sm=sm+(new StringBuilder("oyeee"));
		sm=sm.append("oyeee");
		System.out.println(sm);
	}
}