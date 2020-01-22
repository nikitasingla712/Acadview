import java.util.*;
public class ArrayLeaders{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[j]>=arr[k]){
                    count++;
                }
            }
            if(count==((n-j)-1)){
                System.out.print(" "+arr[j]+" ");
            }
            count=0;
        }
    }
}
