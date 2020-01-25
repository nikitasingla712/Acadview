	import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class removeDuplicate{
    static Node head;
    public static Node insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
        return head;
    }
    public static Node removeDuplicate(Node head){
        Node temp=head;
        while(temp.next!=null){
            Node temp1=temp.next;
            while(temp1!=null){
                if(temp.data==temp1.data){
                    temp1.data=0;
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.data!=0)
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter data: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            head=insert(arr[i]);
        }
        head=removeDuplicate(head);
        display(head);
    }
}
