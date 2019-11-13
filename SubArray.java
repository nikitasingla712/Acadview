import java.util.Scanner;
public class SubArray
{
	public static void check(int arr[], int num)
	{
		int l=arr.length;
		for(int i=0;i<l;i++)
		{
			int Sum = 0;
			for(int j=i;j<l;j++)
			{
				Sum+=arr[j];
				if(Sum==num)
				{
				     System.out.println("Starting index : " + i + ", " + "Ending index : " + j);
				}

			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter elements of array:");
		int arr[] = new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the required sum:");
		int num = sc.nextInt();
		check(arr, num);
	}
}
