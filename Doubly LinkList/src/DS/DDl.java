package DS;


import ll.LL;

public class DDl {
	private LL list=null;
	public DDl() {
		 this.list=new LL();
	 }
	
	public void push(int data) {
		list.add(data);
		System.out.println("the"+data+"has been inserted");
	}
	public int peek() {
		return list.get(size()-1);
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
			return;
		}
		int data=peek();
		list.remove(size()-1);
		System.out.println(data+"removed from the list");
	}

	private int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
public boolean isEmpty() {
	return list.isEmpty();
}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		DDl ddl=new DDl();
//		ddl.push(3);
//		ddl.push(5);
//		ddl.push(36);
//		ddl.push(37);
//		ddl.peek();
//		ddl.pop();
//		ddl.pop();
//		ddl.pop();
//		ddl.pop();
//		System.out.println(	ddl.size());
//	
//		System.out.println(	ddl.peek());
//		System.out.println(ddl.isEmpty());
//}
 
	

}
