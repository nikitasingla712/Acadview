import java.util.*;
public class Rev_String
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of testcases: ");
		int test=sc.nextInt();
		while(test--!=0)
		{
			System.out.println("Enter String:");
		String str=sc.next();
		String str1[]=str.split("\\.",0);
		for(int i=str1.length-1;i>=0;i--)
		{
		    System.out.print("Output :- "+str1[i]);
		    if(i!=0)
		    System.out.print(".");
		}
		}
	}
}
