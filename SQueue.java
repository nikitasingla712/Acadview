public class SQueue 
{
	static SQueue s=new SQueue();
	static SQueue s1=new SQueue();
	public static class Node
	{
		int data;
		Node Link;
	}
	Node top;
	SQueue()
	{
		this.top=null;
	}
	public void push2()
	{
		int d=top.data;
		top=top.Link;
		s1.push(d);
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Underflow");
		}
		System.out.println(top.data+" successfully deleted");
		top=top.Link;
	}
	public void push(int temp)
	{
		Node newNode=new Node();
		if(newNode==null)
		{
			System.out.println("Overflow");
		}
		newNode.data=temp;
		newNode.Link=top;
		top=newNode;
		System.out.println(temp+" has been pushed");
		
	}
	public static void main(String args[])
	{
		s.push(10);
		s.push(20);
		s.push(30);
		s.push2();
		s.push2();
		s.push2();
		s1.pop();
	}
}
