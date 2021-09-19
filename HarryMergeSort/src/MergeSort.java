

public class MergeSort {
	public void printArray(int A[])
	{
	    for (int i = 0; i < A.length; i++)
	    {
	     
	        System.out.print(A[i]+" ");
	    }
	
	}

	public  void merge(int[] array, int low, int mid, int high) {
	    // Creating temporary subarrays
	    int leftArray[] = new int[mid - low + 1];
	    int rightArray[] = new int[high - mid];

	    // Copying our subarrays into temporaries
	    for (int i = 0; i < leftArray.length; i++)
	        leftArray[i] = array[low + i];
	    for (int i = 0; i < rightArray.length; i++)
	        rightArray[i] = array[mid + i + 1];

	    // Iterators containing current index of temp subarrays
	    int leftIndex = 0;
	    int rightIndex = 0;

	    // Copying from leftArray and rightArray back into array
	    for (int i = low; i < high + 1; i++) {
	        // If there are still uncopied elements in R and L, copy minimum of the two
	        if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
	            if (leftArray[leftIndex] < rightArray[rightIndex]) {
	               array[i] = leftArray[leftIndex];
	               leftIndex++;
	            } else {
	                array[i] = rightArray[rightIndex];
	                rightIndex++;
	            }
	        } else if (leftIndex < leftArray.length) {
	            // If all elements have been copied from rightArray, copy rest of leftArray
	            array[i] = leftArray[leftIndex];
	            leftIndex++;
	        } else if (rightIndex < rightArray.length) {
	            // If all elements have been copied from leftArray, copy rest of rightArray
	            array[i] = rightArray[rightIndex];
	            rightIndex++;
	        }
	    }
	}

public  void mergeSort(int[] array, int low, int high) {
    if (high <= low) return;

    int mid = (low+high)/2;
    mergeSort(array, low, mid);
    mergeSort(array, mid+1, high);
    merge(array, low, mid, high);
}
public static void main(String[] args) {
	// int A[] = {9, 14, 4, 8, 7, 5, 6};
 int A[] = {9, 1, 4, 14, 4, 15, 6};
 MergeSort ms= new MergeSort();
ms.printArray(A);
   ms.mergeSort(A, 0, A.length-1);
   System.out.println();
   ms.printArray(A);
 
	 System.out.println();
}
	
	    
	

}
