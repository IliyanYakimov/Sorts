public class ShakerSort {
	public static void shakerSort(int[] arr) {
		int i, k;
		int left = 0, right = arr.length - 1;
		while (right - left > 0) {
			k = 0;
			for (i = left; i < right; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					k = i;
				}
			}
			right = k;
			k = arr.length - 1;
			for (i = right; i > left; i--) {
				if (arr[i - 1] > arr[i]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					k = i;
				}
			}
			left = k;
		}
	}
}
