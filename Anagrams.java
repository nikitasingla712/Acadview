	import java.util.*;
public class Anagrams 
{
	public static void checkAnagrams(String st1,String st2)
	{
		int count=0;
		char c[]=st1.toCharArray();
		char c1[]=st2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if(st1.length()==st2.length())
		{
			for(int i=0;i<st1.length();i++)
			{
				if(c[i]==c1[i])
				count++;
						
			}
		}
		if(count==st1.length())
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first string:");
			String st1=sc.next();
			System.out.println("Enter the second string:");
			String st2=sc.next();
			checkAnagrams(st1,st2);
	
		}
	
}
