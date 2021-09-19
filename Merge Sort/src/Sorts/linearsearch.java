package Sorts;



public class linearsearch {

	int []arr=new int[10];
	
	public void randarr() {
for(int i=0;i<arr.length;i++) {
arr[i]=(int) ((Math.random()*10)+10);



}

	}

	public void binarysearch(int value) {
		// TODO Auto-generated method stub
		int lowIndex=0;
		int highIndex=arr.length-1;
		boolean b=false;
		while(lowIndex<=highIndex) {
			int middleIndex=(lowIndex+highIndex)/2;
			if(arr[middleIndex] < value) lowIndex = middleIndex + 1;
			
			else if(arr[middleIndex] > value) highIndex = middleIndex - 1;
			
			else {
				
				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				b=true;
				lowIndex = highIndex + 1;
				
			}
		
		
	}
		if(b==false) {
			System.out.println("element not fount");
		}
	}

	public void  linser(int value) {
	
		boolean found=false;
for(int i=0;i<arr.length;i++) {
	
	if(arr[i]==value) {
		System.out.println("the index found at the position \t"+i);
		found=true;
		return;
//	}else {
//		System.out.println("the value is not present");
//		
}
	
}
if(found==false) {
	System.out.println("the element not present in the array");
}
	}
	
	public void print() {
	
		for(int a:arr) {
		
				System.out.print(a+" ");
			
		}
		System.out.println();
	}
	public void bubble(int[] array) {
		// TODO Auto-generated method stub
		int n=array.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(array[j+1]<array[j]) {
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		
	}
    public void bubbleSort() {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=0; j < (n-1-i); j++){  
                          if(arr[j+1] < arr[j]){  
                                 //swap elements  
                                 temp = arr[j+1];  
                                 arr[j+1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
	public void insertionSort(){
		//15 14 15 11 19 19 16 14 12 11 
		//11 15 14 15 19 19 16 14 12 11

		for (int i = 1; i < arr.length; i++){
			System.out.println(i+"  iiiii");
			  int j = i;
			  int saved = arr[i];
			  System.out.println(saved+"   saved");
			  while ((j > 0) && (arr[j-1] > saved)){
				  System.out.println(j+"   jjj");
				  System.out.println(arr[j]+"   arr[j");
				  
				  
				  arr[j] = arr[j-1];
				  
				  
				  System.out.println(arr[j]+"   arr[j swaped");
				  
				  j--;
				  
				  System.out.println(j+"   jjj");
				
				  
			  }
			  System.out.println("-----------------------------------------");
			  arr[j] = saved;
			  
			  
			  System.out.println(arr[j]+"   arr[j");
			
			  
			  System.out.println("\nArray[i] = " + arr[i] + " Array[j] = " + arr[j] + " toInsert = " + saved + "\n");
			
		}
		
	}
        public  void selectionSort(){  
            for (int i = 0; i <arr.length - 1; i++)  
            {  
                int min = i;  // min=2==15 and j=3==10
                for (int j = i + 1; j < arr.length; j++){  
                    if (arr[j] < arr[min]){  
                        min = j;//searching for lowest index  min=3==10
                    }  
                }  
                int temp = arr[min];   //temp==10
                arr[min] = arr[i];      // i=2==15
                arr[i] = temp;    //replace 15 with the temp value that is 15
            }  
        }  
			  
                 
                
			  
		
		
	
	public static void main(String[] args) {
		int [] array= {12,24,1,0,33,22,1,7,8};
		linearsearch ls=new linearsearch();

		ls.randarr();
		ls.print();
		ls.linser(15);
		//ls.bubbleSort();
//		if(true){
//		for(int a:array) {
//			System.out.print(a+"  ");
//		}
//		System.out.println();
//		}
//		
//		ls.linser(10);
//		ls.selectionSort();
		ls.insertionSort();
		ls.print();
		//ls.binarysearch(15);
		
	}


}

	

