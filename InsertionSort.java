public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			int k = i; // k is the index of min element
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					k = j;
				}
			}
			int temp = arr[i]; arr[i] = arr[k]; arr[k] = temp;
		}
	}
}
