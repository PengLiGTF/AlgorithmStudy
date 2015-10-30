package com.lipeng.algorithm;

import java.util.Arrays;

public class QuickSort
{

	public static void main(String[] args)
	{
		int[] arr = new int[] { 4, 10, 3, 6, 3, 7, 5, 8, 2, 9, 1 };
		int start = 0;
		int end = arr.length - 1;
		// new QuickSort().quick_sort(arr, start, end);
		new QuickSort().quickSort(arr, start, end);

		System.out.println(Arrays.toString(arr));

	}

	static int partition(int[] unsorted, int low, int high)
	{
		int pivot = unsorted[low];
		while (low < high)
		{
			while (low < high && unsorted[high] >= pivot)
				high--;
			unsorted[low] = unsorted[high];
			while (low < high && unsorted[low] <= pivot)
				low++;
			unsorted[high] = unsorted[low];
		}
		unsorted[low] = pivot;
		return low;
	}

	static void quick_sort(int[] unsorted, int low, int high)
	{
		int loc = 0;
		if (low < high)
		{
			loc = partition(unsorted, low, high);
			quick_sort(unsorted, low, loc - 1);
			quick_sort(unsorted, loc + 1, high);
		}
	}

	public void quickSort(int[] arr, int start, int end)
	{
		if (start < end)
		{
			int partion = partition2(arr, start, end);
			quickSort(arr, start, partion - 1);
			quickSort(arr, partion + 1, end);
		}

	}

	public int partition2(int[] arr, int start, int end)
	{
		int pivot = arr[start];
		while (start < end)
		{
			while (arr[end] > pivot && end > start)
			{
				end--;
			}
			arr[start] = arr[end];
			while (arr[start] <= pivot && start < end)
			{
				start++;
			}
			arr[end] = arr[start];
		}
		arr[start] = pivot;
		return start;

	}
}
