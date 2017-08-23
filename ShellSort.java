public class ShellSort {
	public static void shellSort(int arr[])
	{
		int gaps[] = { 3, 2, 1 };
		for (int t = 0; t < 3; t++)
		{
			int gap = gaps[t];
			for (int i = gap; i < arr.length; i += gap)
			{
				int elem = arr[i];
				for (int j = i - gap; j >= 0; j -= gap)
				if (elem < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+gap];
					arr[j+gap] = temp;
				}
				else
				{
					break;
				}
			}
		}
	}
}
