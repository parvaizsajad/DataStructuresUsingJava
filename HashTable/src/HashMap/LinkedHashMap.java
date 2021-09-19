package HashMap;

import HashMap.HashMap.Node;

public class LinkedHashMap extends HashMap {
	class LNode extends LinkedHashMap.Node{
LNode after;
LNode before;
		public LNode(String key, String value) {
			super(key, value);
			
		}
		
	}// end of the Lnode inner class.
	LNode head;
	LNode tail;
	
	private void afterInsert(LNode curr) {
		if(head==null) {
			head=tail=curr;
		}else
		{
			tail.after=curr;
			curr.before=tail;
			tail=curr;
		}
	}
@Override
public String toString() {
	LNode curr=head;
	StringBuffer sb = new StringBuffer();
	sb.append("{");
	while(curr!=null) {
		sb.append(curr.key);sb.append("=");sb.append(curr.value);sb.append(",");
				curr=curr.after;
	}
	if(sb.length()>1) {
		sb.deleteCharAt(sb.length()-1);
	}
			sb.append("}");
			return sb.toString();
}
@Override
public Node CreateHashNode(String key, String value) {// this is method to create the node in the linked hash map of the type l node and
	//store the value in the varriable new node.
	// TODO Auto-generated method stub
	LNode newNode= new LNode(key,value);
	afterInsert(newNode);// this calls after insert method passing the new node as the argument.
	// and returns the node in the inserting order after the previous node where head is the first element and the tail is the last element.
	return newNode;
}

@Override
public void afterRemoveNode(Node node) {// after removing the node...
	// TODO Auto-generated method stub
	LNode curr= (LNode)node;// create the node curr and assign it to the node in the argument.
	
	LNode nex=curr.after;// create the node nex and point it to the curr.after.
	LNode prev= curr.before; // and the prev to the curr . before.
	
	if (curr==head) { // if the element is the first element then the move the head to the next.
		head=head.after;
		head.before=null; // and make the head before equal to the null
	}
	else if(curr==tail) { // if the curr ==tail that means the last element of the linked list .
	prev.after=null;  // make the last but one elements after equal to the null and move the tail to the prev element
    tail=prev;
		
	}
	else {// if the element is in betweeen then make the prev next equal to the nex and the nex before = previous
		prev.after=nex;
		nex.before=prev;
		
	}
		curr.after=curr.before=null;   //make the curr.before and curr .nex equal to the null so that it is available for the garbage collection.
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm= new LinkedHashMap();
//System.out.println(hm.hash("parvaizSajad"));
hm.put("one", "One");
hm.put("two", "TWO");
hm.put("three", "THREE");
hm.put("one", "modified");
hm.put("one", "newvalue");
hm.put("five", "Five");
hm.put("six", "SiX");

hm.remove("three");
hm.remove("five");

System.out.println(hm.size());
System.out.println(hm.toString());
	}

}
