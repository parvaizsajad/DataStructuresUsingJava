package dis;

public class dia {

	public static void main(String[] args) {
		
	
			
		
	int arr[]={3,4,343,32,34,4344,3};
	
	int front=3;
	int  rear=2;
			int i;
			System.out.println("the elements are :");
			for(i=front;i!=rear;i = (i + 1) %arr.length)
		{
				System.out.print(+arr[i] +" ");
				System.out.println("value of i is  :"+i);
			}

			System.out.print(+arr[i] +" ");
			System.out.println("value of i is  :"+i);
		}

	}


