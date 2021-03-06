package practice;
public class BinarySearch {
	    
	    int binarySearch(int arr[], int first, int last, int element)
	    {
	        if (last >= first) {
	            int mid = first + (last - first) / 2;
	  
	            if (arr[mid] == element)
	                return mid;
	            
	            if (arr[mid] > element)
	                return binarySearch(arr, first, mid - 1, element);
	            else
	            	return binarySearch(arr, mid + 1, last, element);
	        }
	        return -1;
	    }
	  
	    public static void main(String args[])
	    {
	    	BinarySearch ob = new BinarySearch();
	        int arr[] = { 2, 3, 4, 10, 40, 50 };
	        int length = arr.length;
	        int element = 10;
	        int result = ob.binarySearch(arr, 0, length - 1, element);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index " + result);
	    }
	}