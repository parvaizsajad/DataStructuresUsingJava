package LinkedList;

public class LinkedListImpl {
	// we will create one inner class which will be used  to create one new node in the link list if we want to enter it any where.
	public class Node{
		//the node will contain two fields data and the next. Data will store 
		//the data example 5,8 and the node will store the address of the next node.
		
		int data ;
		Node next;
		public Node(int data) {
			//here we will set the data outside equal the inner data.
			this.data=data;
			
		}//closing of the constructor
		
	}//ending of the inner class node....
Node head;//we will create the field head of the type node.....
Node tail; // the tail of the type node.
int size=0;//size of the type int to track the size of the link list.
// method to append the element at the end of the link list.
public void add(int data) {
	Node nodeu=new Node(data);// object of the new node and the data inside its constructor.
// if we want to add the node when there is no element present in the the 
	//ll that means the head will null.
	if (head==null) {
		head=nodeu;// we will set the head equal to the node which means the node will point to the first element.
		tail=nodeu;// we will also set the tail equal to the new node because there is only one element present in the ll.
		
	}else {//if the ll is not empty then tail next will be equal to the new node 
		tail.next=nodeu;
		tail=nodeu;// and the tail will be equal to the new node.
		

	}
	
	size++;// end we will increase the size with one.....
	System.out.print("data inserted \t"+nodeu.data);
	System.out.println("\t the size of the linklist is :\t"+size);
	System.out.println("Element= "+this);// this is used to display the elements.
}

@Override
public String toString() {// to string method to print the output in the braces and saperated by commas....
	StringBuffer sb=new StringBuffer();// we will create the sting buffer to manuplate the string.
	sb.append("[");// first we will append the opening square brackets.
	Node curr=head; // we will create the new node curr which we will use to iterate over the link list....
while(curr !=null) {// here condition will be curr not equal to the not which will be the last node of the ll.
	sb.append(curr.data).append(","); // then we will append the curr.data .here curr is the counter of 
	//the loop and it will give us the data
	//after ever iteration of the loop the curr will start from the head that means it will start from the first element.
	curr=curr.next;// here we are incrementing the curr value and pointing it to the curr.next value.... node can not be incremented
	//with the i++ .

}//ending of the while loop
if(sb.length()>1) {// when ever we add the commas we will have an extra comma in the output 
	sb.deleteCharAt(sb.length()-1);//// here we will use the method delete char at length minus 1 to get the last element of the string.
}
	sb.append("]");// at last we will append the closing the bracket 
	
	return sb.toString(); //ad return the sb string 
}
public void add(int data, int index) {// method to add the node at the specified index.
	
	if(index< 0 || index > size-1) {// cond index should be greater than 0 or less that size minus one.
		System.err.println("index out of the bond");
		return;
	}
	Node curr=head; //here also we will create the new node that is curr and set it equal to the head.

	Node prev=null; // we will create the another field prev and set it the value null.
int i=0; // field int i for the counter of the while loop.....
while(curr!=null && i!=index) {//condtition curr should not be equal to the null and the i should not be equal to the index.
	//so id the index is 2 then our index will stop before the index.
	prev=curr;// curr and i will point to the same element so we will set the prev equal to the curr.
	curr=curr.next; // and increament the node curr to the next value. so that we can insert the new node in between of the prev and the cur.
	i++;// this is the increament of the i counter for the while loop
	
}
Node no=new Node(data);// object of the node to enter the new node .
if (prev==null) {// cond if prev equal to the null tha means at the 0 index of the ll...
	no.next=head;// we will set the new node next equal to the head.
	head=no; // and make the head new node.
	
}else {// if the prev is not null that means there are already elements there in the ll.
	prev.next=no; // we will set the prev.next equal to the new node
	no.next=curr;// and the new node next equal to the currr.
	

}
size++;// and increase the size with the one.
System.out.print("data inserted \t"+no.data);
System.out.println("\t the size of the linklist is :\t"+size);
System.out.println("Element= "+this);
}
// now we will write the functions related the linklist 
public int size() {
return size;	
}
public void update(int data,int index) {
	Node curr=head;
	int i=0;
	while(curr!=null) {
		if(i==index) {
			curr.data=data;
			System.out.println(this);
			break;
		}
		
		curr=curr.next;
		i++;
		
	}
	if(curr==null) {
		System.err.println(" the index is not available");
	}
}
public void deletedata(int data) {
	Node curr=head;
	Node prev=null;
	while(curr!=null && curr.data!=data) 
	{
		prev=curr;
		curr=curr.next;
	}// end of the while loop.
	if (curr==null) {
		System.out.println("data not found in the list");
		return;
	}
	if (prev==null) {
		head=head.next;
		
	}else {
		prev.next=curr.next;
	}
	if(curr==tail) {
		tail=prev;
	}
	//curr.next=null;
	size--;
	System.out.println(this);
}


public void find(int data) {
	Node curr=head;
	int i=0;
	
	
	while(curr!=null) {
		
		if (curr.data==data) {
			System.out.println(data + " the index of the data is \t"+i);
			break;
		}
		
		curr=curr.next;
		i++;
		
		
	}
	if(curr==null) {
		System.err.println(" the index is not available");
	}
	
}
public  void cleara() {
tail=head=null;
size=0;
System.out.println(this);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl lk=new LinkedListImpl();
		lk.add(30);
		lk.add(60);
		lk.add(77);
	
		lk.add(111, 1);

	lk.cleara();
	
	
		System.out.println(lk.size());
	

		
	
		
	
	


	}

}
