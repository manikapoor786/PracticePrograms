package practice;

import java.util.Arrays;

public class Kthsmallestlargest {

	public static int kthSmallest(Integer[] arr, int k) {
		int l=arr.length;
		Arrays.sort(arr);

		//return arr[k - 1];
		return arr[l-1];//largest
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 4;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}

}
