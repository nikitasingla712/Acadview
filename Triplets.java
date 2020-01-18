  
import java.util.Scanner;
public class Triplets {
public static void checkPT(int arr[])
{
	int flag=0;
	for(int i=0;i<arr.length-2;i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if((arr[k]*arr[k])==((arr[i]*arr[i])+(arr[j]*arr[j])))
				{
					flag=1;
					break;
				}
			}
		}
	}
	if(flag==1)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test cases:");
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		System.out.println("Enter the no. of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		checkPT(arr);
		}

	}

}
