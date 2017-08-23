public class QuickSort {
	private static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int temp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  temp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = temp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	private static void quickSortHelper(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSortHelper(arr, left, index - 1);
	      if (index < right)
	            quickSortHelper(arr, index, right);
	}
	
	public static void quickSort(int arr[]) {
		quickSortHelper(arr, 0, arr.length-1);
	}

}
