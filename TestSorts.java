import java.util.Arrays;
import java.util.Scanner;

public class TestSorts {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array's size: ");
		int size = input.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter next element: ");
			arr[i] = input.nextInt();
		}
		
		int number;
		do {
			System.out.println("Enter a number between 1 and 6: \n" + 
								"1 - Bubble sort \n 2 - Insertion sort \n 3 - Merge sort \n" +
								"4 - Quick sort \n 5 - Shaker sort \n 6 - Shell sort");
			number = input.nextInt();
		} while (number < 1 || number > 6);

		switch (number) {
		case 1: 
			BubbleSort.bubbleSort(arr);
			System.out.println("After sort: " + Arrays.toString(arr));
			break;
		case 2:
			InsertionSort.insertionSort(arr);
			System.out.println("After sort: " + Arrays.toString(arr));
			break;
		case 3:
			MergeSort obj = new MergeSort();
			obj.mergeSort(arr);
			System.out.println("After sort: " + Arrays.toString(arr));
			break;
		case 4:
			QuickSort.quickSort(arr);
			System.out.println("After sort: " + Arrays.toString(arr));
			break;
		case 5:
			ShakerSort.shakerSort(arr);
			System.out.println("After sort: " + Arrays.toString(arr));
			break;
		case 6:
			ShellSort.shellSort(arr);
			System.out.println("After sort: " + Arrays.toString(arr));
			break;
		default: System.out.println("there is no need from this");
		}
	}
}
