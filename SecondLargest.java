import java.util.Scanner;
public class SecondLargest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int temp=0;
		System.out.println("Enter elements of Array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println("Largest: "+arr[0]);
			System.out.println("Second: "+arr[1]);
	}
}
