package circQueueMain;

public class Controller {
	int capacity=5;
	int arr[]=null;
	int front=0;
	int rear=-1;
	int size=0;
	Controller(int capacity){
		this.arr=new int[capacity];
	}
	Controller() {
		this.arr=new int[capacity];
	}
	
public void Enque(int data) {
	if(size==capacity) {
		System.err.println("the queue is full");
		return;
	}
	rear=(rear+1)%capacity;
	arr[rear]=data;
	System.out.println(data+"   has been enqueed");
	size++;
	System.out.println("the rear is"+rear);
}

public void deque() {

	if(size==0) {
		System.err.println("the queue is empty");
		return;
	}

	int data= arr[front];
	
	front=(front+1)%capacity;
	System.out.println(data+"   has been dequed");
	size=size-1;
	System.out.println("the front is"+front);
	
	
}
public int sizeof() {
	return size;
}
public void display() {
	if(size==0) {
		System.err.println("no elements are present");
		return;
	}
	int i;
	System.out.println("the elements are :");
	for(i=front;i!=rear;i = (i + 1) %capacity)
{
		System.out.print(+arr[i] +" ");
	}

	System.out.print(+arr[i] +"\n ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c=new Controller();
	c.Enque(4);
	c.Enque(3);
	c.Enque(2);
	c.Enque(1);
	c.Enque(0);
	c.Enque(0);
	c.display();
	c.deque();
	
c.display();
c.Enque(99);

c.display();//	
System.out.println("the size is\t"+c.sizeof());

		

	
		
		
		

	}

}
