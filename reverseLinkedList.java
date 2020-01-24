import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
public class reverseLinkedList {
	static Node head;
	public static Node insertEnd(Node head,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(head==null)
			head=newNode;
		else{
			Node last=head;
			while(last.next!=null)
				last=last.next;
			last.next=newNode;
		}
		
		
		return head;
	}
	public static Node reverse1(Node head)
	{
		Node prev=null,next=null,current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		return head;
	}
	public static void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp);
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int a=sc.nextInt();
		head=insertEnd(head,a);
	}
	head=reverse1(head);
	display(head);
}
}
