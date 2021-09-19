package HashMap;
public class HashMap {
	public class Node{ // inner class which contains the node 
	String key;
	String value;
    Node next;  /*node contains the key value and the next .next to store the node if we have the
    dame hash code for the two different keys.*/
	public Node(String key, String value) {
		this.key=key;
		this.value=value;
		// initilizing the key and the value so that the we provide the values on creating the object
	}
	}// end of node inner class
	private Node[] hashtable=null;// creating the array of the nodes.
	private int bucketSize=16;// size for the array size ...hashmap default value is 16
	//as hashmap is growable we can call the grow function like we used in the array list.
	int size=0;
	public HashMap() {// constructor of the outer main class 
		hashtable=new Node[bucketSize];// here we initilize the hashtable array with the size 16 of type node
	}// end of the constructor
	public Node CreateHashNode(String key, String value) {// this method creates the object of the new node.which we can point to the hash table of the position array.
		return new Node(key, value);
	}
	public int hash(String key) {
		// TODO Auto-generated method stub
		return Math.abs(key.hashCode())%bucketSize;
	}
	public void put(String key,String value) {//hashmap uses the put method to add the value in the map
		// and takes the argument as key and the value
		int position=hash(key);// calling hashcode method to convert the string key into the hashcode and 
		// storing it inside the position variable .
		Node curr=hashtable[position];//create a node curr which points the hashtable position
		if(curr==null) {//if there is no element present inside the hashtable.
		hashtable[position]=CreateHashNode(key,value);//creating the object of the new node which points the position in the hashtable array.
		size++;
		}
		else// if the value is already present.
		{
			while(curr.next != null && curr.key != key) {/* curr next should not be equal to the null and
				curr.key should not be equal to the previous key.which means that the new node of the same
				hash code will be placed next after the node if it is already present.
				and the curr key should not be equal to the key because we don't want duplicates in hashmap.*/
				
				curr=curr.next;// Incrementing the value of the curr.
			}
			if(curr.key==key) {// if the key is same then we have to update the value in place of the previous value.
				
				curr.value=value;// asining the previous  value the new value.
				
			}else {//else place the new node after the curr.next  if the curr.next is not null and the curr.key is equal to the key if these are not the cases.
			//which means the key is not the same and the hash code is same.
				curr.next=CreateHashNode(key, value);// means create the node after the node where hashtable of the position is already present.
			// the new node will be present after the previous node as the linklist .which means the previous node will store the new node address.
				size++;
			}
		}
		//System.out.println(position+"\t the position");
		//System.out.println(key+"\t is the key");
	
	}
	
public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append("{");
	for(int i=0;i<bucketSize;i++) {
		
		Node node=hashtable[i];
	while(node != null) {
		sb.append(node.key);sb.append("=");sb.append(node.value);sb.append(",");
		node=node.next;
	}
	}
	if(sb.length()>1) {
		sb.deleteCharAt(sb.length()-1);
	}
			sb.append("}");
			return sb.toString();
}

public String get(String key) {// this searches the target value by taking the key as an argument and searches the node by the
	//find method and stores in the variable target.
	Node target= find(key);
	if(target==null)return null;
	return target.value;// returns the target node value.
}
public boolean contains(String key) {
	Node target=find(key);
	
	return target != null;
}
public Node find(String key) {// this method finds the node on the basis of the key provided as the  argument.
	int position= hash(key);// this will convert the key into the hash code and stores that in the variable position.
	Node targetNode=hashtable[position];// create creates a targrtNode and points to the position in the array hash table.
	if(targetNode==null)return null;// checks if the if the target nofe == null... means that there is no value so we return false.
	else {
		while(targetNode != null && targetNode.key != key) {//if the target node is not null then we should traverse the link list at 
			// the particular index.
			targetNode=targetNode.next; //moves the node to the next position.
		}
		
	}
	
	return targetNode; //and the returns the node
}

public boolean remove(String key) {// this method helps to remove the node
	int position= hash(key);
Node targetNode=hashtable[position];
Node curr=targetNode;
Node prev= null;
while(curr != null && targetNode.key != key) {
	prev=curr;
	curr=curr.next;
}
if(curr==null) return false;
if(prev==null) {
	hashtable[position]= curr.next;
	
}else {
	prev.next=curr.next;
}
curr.next=null;
afterRemoveNode(curr);
size--;
return true;
}
public void afterRemoveNode(Node curr) {
	
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
public void clear() {
	size=0;
	this.hashtable=new Node[bucketSize ];
}


}
