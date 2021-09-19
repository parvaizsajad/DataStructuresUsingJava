
package parvaiz;


public class main {
	int top=-1;
	int size=5;
	int [] arr=null;
	public main() {
		this.arr=new int[size];
	}
	public main(int size) {
		this.size=size;
		arr=new int[size];
	}
	public void push(int data)
	{
		if(top+1>=size)
		{
			System.out.println("the stack is full");
			return;
		}
		top=top+1;
		arr[top]=data;
		System.out.println(data+" has been inserted");;
	}
public int pop()
{
	if(top==-1)
	{
		
			System.out.println("the stack is empty");
			return -1;
		
	}
	int data=arr[top];
	top=top-1;
	System.out.println(data+" has been removed from the stack ");
	

	return data;
	
}
public void peek()
{
	if(top==-1) {
		System.out.println("stack is empty");
		return;
	}
	System.out.println("the top is  : "+arr[top]);
}
public void isfull() {
	System.out.println(top+1==size); 
}
public void isempty()
{
	System.out.println(top==-1); 

}
public void display()
{
	System.out.print("the elements are: ");
	for(int a=0;a<=top;a++) {
		System.out.print(arr[a]+" ");
		
	}
	System.out.println();
}
public void size() {

System.out.print("the size is:");
		System.out.println(top+1); 
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		main m=new main();
//		
//
//
//	
//m.isempty();
//m.isfull();
//m.push(1);
//m.isempty();
//m.isfull();
//m.pop();
//
//m.peek();
//m.display();
//m.push(8);
//m.push(9);
//m.push(66);
//m.display();
//m.size();
//m.pop();
//m.size();
//m.push(44);
//m.push(445);
//m.push(4422);
//m.push(5);
//m.display();
//m.pop();
//m.peek();
//
//
//
//
//	}

}
