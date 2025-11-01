package sample;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array= {1,2,4,5,8,16,32};
		int target = 8;
		int result= binarySearch(array,target);
		if(result == -1) {
			System.out.println("Element not found in the array");
		}
		else {
			System.out.println("Element found at index "+ result);
		}
	}
		public static int binarySearch(int[] array, int target) {
		int left=0;
		int right= array.length -1;
		while (left <= right) {
			int mid = (left +right)/2;
			if(array[mid]==target) {
				return mid;
				}
			else if(array[mid]<target) {
				left= mid+1;
			}
			else {
					right = mid -1;
				}
			}
	return -1;
	}

}
