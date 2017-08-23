public class MergeSort {
	private int[] numbers;
	private int[] temp;

	private int number;

	public void mergeSort(int[] values) {
		this.numbers = values;
		number = values.length;
		this.temp = new int[number];
		mergesortHelper(0, number - 1);
	}

	private void mergesortHelper(int left, int right) {
		if (left < right) {
			int middle = left + (right - left) / 2;
			mergesortHelper(left, middle);
			mergesortHelper(middle + 1, right);
			merge(left, middle, right);
		}
	}

	private void merge(int left, int middle, int right) {

		// Copy both parts into the helper array
		for (int i = left; i <= right; i++) {
			temp[i] = numbers[i];
		}

		int i = left;
		int j = middle + 1;
		int k = left;

		while (i <= middle && j <= right) {
			if (temp[i] <= temp[j]) {
				numbers[k] = temp[i];
				i++;
			} else {
				numbers[k] = temp[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			numbers[k] = temp[i];
			k++;
			i++;
		}
	}
}
