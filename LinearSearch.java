package sample;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array= {2,3,5,7,8,9,12,4,98,45};
		int target = 12;
		int result = linearSearch(array,target);
		if(result == -1) {
			System.out.println("Element not found in the array");
		}
		else {
			System.out.println("Element found at index "+ result);
		}
	}
	public static int linearSearch(int[] array, int target){
		for(int i =0;i<array.length;i++) {
			if(array[i] == target) {
				return i;
			}
		}
		return -1;
		
	}
}

