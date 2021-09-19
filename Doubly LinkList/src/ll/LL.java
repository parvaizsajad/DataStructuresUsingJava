package ll;





public class LL {
	public class Node{
		Node next;
		Node prev;
		int data;
	public Node(int data) {
		this.data=data;
	}
	}
Node head;
Node tail;
int size=0;
	
	
	@Override
public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		Node curr=head;
		while(curr!=null) {
			sb.append(curr.data).append(",");
			curr=curr.next;
			
		
		}
		if(sb.length()>1) {// when ever we add the commas we will have an extra comma in the output 
			sb.deleteCharAt(sb.length()-1);//// here we will use the method delete char at length minus 1 to get the last element of the string.
		}
			sb.append("]");// at last we will append the closing the bracket 
			
			return sb.toString(); //ad return the sb string 
		}

	public void add(int data) {
	Node nn=new Node(data);
		if(head==null) {
			head=tail=nn;
		}else
		{
			tail.next=nn;
			nn.prev=tail;
			tail=nn;
		}
		size++;
		System.out.println(this);
	}
	public void addind(int data,int index) {
		if(index<0||index>size-1) {
			System.out.println("the index is out of the bond");
			return;
		}
		Node nn=new Node(data);
		Node curr=findNode(index);
		Node prevNode=curr.prev;
	
		if(curr==head) {
			nn.next=head;
			head.prev=nn;
			head=nn;
		}
		else {
		prevNode.next=nn;
		nn.prev=prevNode;
		nn.next=curr; 
		curr.prev=nn;
		}
		size++;
		System.out.println(this);		
	}
public int get(int index) {
	if(index<0||index>size-1) {
		System.out.println("the index is out of the bond");
		return -1;
	}
	//forward direction
 Node	target=findNode(index);
	return target.data;
}


public Node findNode(int index) {
	int mid=(size-1)/2;

	if(mid<index) {
		//forward direction
		return findForward(index);
	}
		return findBackword(index);
}
private Node findForward(int index) {
	Node curr=head;
	int i=0;
	while(curr!=null && i!=index) {
		curr=curr.next;
		i++;
	}
	return curr;
}
private Node findBackword(int index) {
	Node curr=tail;
	int i=size-1;
	while(curr!=null && i!=index) {
		curr=curr.prev;
		
		i--;
	}
	return curr;
}
public void remove(int index) {
	if(index<0||index>size-1) {
		System.out.println("the index is out of the bond");
		return;
	}
	Node curr=findNode(index);
	Node prev=curr.prev;
	Node Nex=curr.next;
	if (curr==head) {
		head=head.next;
		if(head != null) {
			head.prev=null;
		}else
		{
			head=tail=null;
		}
	
	}
	else if(curr==tail) {
	tail=tail.prev;
	tail.next=null;
		
	}
	else {
		prev.next=curr.next;// set prev next add equal to the curr.next.
		curr.prev=prev;//the curr prev addes wil set to the prev
		curr.next=null;
		curr.prev=null;
		
	}
	size--;
	System.out.println(this);
}
public boolean isEmpty() {
	return size()==0;
}
public int size() {
	// TODO Auto-generated method stub
	return size;
}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//LL ll=new LL();
//ll.add(50);
//ll.add(51);
//ll.add(52);
//ll.addind(1,1);
//ll.addind(1,0);
//ll.remove(0);
//
//ll.remove(3);
//ll.remove(1);
//	}

}
