
public class queue {
int [] arr=null;
int capacity =5;
int front =0;
int rear=-1;
public queue()
{
	arr=new int[capacity];
}
	public queue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
	}
	public void enque(int data)
	{
		if (rear+1==capacity)
		{
			System.out.println("the queue is full");
			return;
		}
		rear=rear+1;
		arr[rear]=data;
		System.out.println(data+" enqued successfylly");
	}
	public void sizeof() {
		int sizeof=rear+1;
		System.out.println("the size of the qeue is "+sizeof);
	}
	public void isfull()
	{
		boolean ist =(rear+1==capacity);
		
			System.out.println("the full is: "+ist);
		
	}
	public void isempty()
	{
		boolean ist =(rear==-1);
		
			System.out.println("the empty is: "+ist);
		
	}
	public void dequeue() {
		if (front==rear+1)//
		{
			System.out.println("no element present in the queue");
			return;
		}
		int data=arr[front];
		for(int i=front;i<rear;i++)
		{
			arr[i]=arr[i+1];
		}
		rear--;
	System.out.println(data+ "  has be dequeued");
	}
	public void rear()
	{
		System.out.println("the rear is "+arr[rear]);
	}
	public void front()
	{
		System.out.println("the front is "+arr[front]);
	}
	public void display()
	{
		for (int i=0;i<rear+1;i++)
		{
			System.out.print("the elements are : "+arr[i]);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
queue q =new queue(4);
q.enque(3);
q.enque(6);
q.enque(7);
q.enque(8);
q.enque(9);

q.dequeue();


q.isfull();
q.front();
q.rear();

q.isempty();

q.sizeof();
q.display();

	}

}
