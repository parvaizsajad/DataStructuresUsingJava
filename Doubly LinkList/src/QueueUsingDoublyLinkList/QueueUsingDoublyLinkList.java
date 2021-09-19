package QueueUsingDoublyLinkList;


import ll.LL;

public class QueueUsingDoublyLinkList {

	private LL list=null;
	public QueueUsingDoublyLinkList() {
		this.list=new LL();
	} 
	public void enque(int data) {
		list.add(data);
		System.out.println(data+"\t has been inserted in the link list ");
	}
	public void deque() {
		int data= list.get(0);
		list.remove(0);
		System.out.println(data+ "\t has been removed from the list");
	}
	public int front() {
		return list.get(0);
	}
	public int rear() {
		return list.get(size()-1);
	}
	public int size() {
		return list.size();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingDoublyLinkList qd=new QueueUsingDoublyLinkList();
qd.enque(5);
qd.enque(15);
qd.enque(25);
qd.enque(35);

System.out.println(qd.front());
System.out.println(qd.size());
System.out.println(qd.rear());
System.out.println(qd.size());
	}

}
