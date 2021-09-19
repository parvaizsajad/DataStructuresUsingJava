package Sorts;



public class MyMergeSort  
{  
	void printArray(int A[])
	{
	    for (int i = 0; i < A.length; i++)
	    {
	     
	        System.out.print(A[i]+" ");
	    }
	System.out.println();
	}

	void merge(int A[],  int low,int mid, int high)
	{
	    int i, j, k;
	    int B[]=new int[A.length];
	    i = low;
	    j = mid + 1;
	    k = low;

	    while (i <= mid && j <= high)
	    {
	        if (A[i] < A[j])
	        {
	            B[k] = A[i];
	            i++;
	            k++;
	        }
	        else
	        {
	            B[k] = A[j];
	            j++;
	            k++;
	        }
	    }
	    while (i <= mid)
	    {
	        B[k] = A[i];
	        k++;
	        i++;
	    }
	    while (j <= high)
	    {
	        B[k] = A[j];
	        k++;
	        j++;
	    }
	    for (int ii = low; ii <= high; ii++)
	    {
	        A[ii] = B[ii];
	    }
	    
	}

	void mergeSort(int A[], int low, int high){
	   
	    if(low<high){
	       int mid = (low + high) /2;
	        mergeSort(A, low, mid);
	        mergeSort(A, mid+1, high);
	        merge(A,low, mid, high);
	    }
	}

public static void main(String[] args) {
	// int A[] = {9, 14, 4, 8, 7, 5, 6};
 int A[] = {9, 1, 4, 14, 4, 15, 6};
 MyMergeSort ms= new MyMergeSort();
   ms.printArray(A);
    ms.mergeSort(A, 0, A.length-1);
    ms.printArray(A);
  
}
	
	    
	

}