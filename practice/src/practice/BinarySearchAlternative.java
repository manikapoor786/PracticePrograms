package practice;
public class BinarySearchAlternative {

	public static void binarySearch(int arr[], int first, int last, int key) {
		if (first > last)
		{
			System.out.println("Element is not found!");
		} 
		else 
		{
			int mid = (first + last) / 2;
			while (first <= last) {
				if (arr[mid] < key) {
					first = mid + 1;
				} else if (arr[mid] == key) {
					System.out.println("Element is found at index: " + mid);
					break;
				} else {
					last = mid - 1;
				}
				mid = (first + last) / 2;
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50, 70 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}
