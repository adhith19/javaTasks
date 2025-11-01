package sample;

public class BubbleSort {
	public static void main(String [] args) {
		int[] array = {64,76,12,45,9,80};
		System.out.println("Original array:");
		printArray(array);
		bubbleSort(array);
		System.out.println("Sorted array");
		printArray(array);
	}

	public static void bubbleSort(int[] array) {
	
	    int n = array.length;
	    for(int i = 0; i< n-1;i++) {
	    	for(int j = 0; j < n-i;j++ ) {
	    		if (array[j]>array[j+1]) {
	    			int temp = array[j];
	    			array[j] =array[j+1];
	    			array[j+1]=temp;
	    		}
	    	}
	    }
	}

	public static void printArray(int[] array) {

		for(int j : array) {
			System.out.println(j+ " ");
			
		}
	System.out.println();
	}

}
