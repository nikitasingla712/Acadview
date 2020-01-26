import java.util.Scanner;

public class PalindromeLL {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public static LinkedListPalindrome insert(LinkedListPalindrome li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head == null)
		li.head=newNode;
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static void display(LinkedListPalindrome li)
	{
		Node temp=li.head;
		System.out.print("OUTPUT ==>");
		while(temp.next!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
	public static Node reverseList(Node temp) {
		Node current = temp;  
	    Node prevNode = null;
	    Node nextNode = null;  
	    while(current != null){  
	        nextNode = current.next;  
	        current.next = prevNode;  
	        prevNode = current;  
	        current = nextNode;  
	    }
	    return prevNode;
	}
	public static void checkPalindrome(LinkedListPalindrome li, int size){ 
		Node current=li.head;  
	    boolean flag=true;   
	    int mid=(size%2 == 0)? (size/2) : ((size+1)/2);   
	    for(int i=1;i<mid;i++){  
	    	current=current.next;  
	    }
	    //Reverse the list after middle node to end  
	    Node revHead=reverseList(current.next);  
	    //Compare nodes of first half and second half of list  
	    while(li.head!=null && revHead!=null){  
	    	if(li.head.data!=revHead.data){  
	    		flag=false;  
	            break;  
	        }  
	    	li.head=li.head.next;  
	        revHead=revHead.next;  
	    }  
	    if(flag)  
	    	System.out.print("\nPalindrome");  
	    else  
	        System.out.print("\nNot a Palindrome");   
	}
	public static void main(String args[]) {
		LinkedListPalindrome li=new LinkedListPalindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the linked-list:- ");
		int size=sc.nextInt();
		System.out.println("Enter the elements:- ");
		for(int i=0;i<size;i++) {
			LinkedListPalindrome.insert(li, sc.nextInt());
		}
		display(li);
		checkPalindrome(li, size);
		sc.close();
	}
}
