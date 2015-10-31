package com.lipeng.algorithm;

import static java.lang.System.out;

import java.util.Arrays;

public class HeapSort
{

	public static void main(String[] args)
	{
		out.println(5 / 2);
		int[] arr = new int[] { 100, 23, 6, 5, 3, 1, 8, 7, 2, 4, 10, 4 };
		// buildHeap(arr, 8);
		heapSortMaxHeap(arr, arr.length);
		out.println(Arrays.toString(arr));
	}

	public static void heapSortMinHeap(int[] arr, int count)
	{
		while (count > 0)
		{
			buildMixHeap(arr, count);
			int end = count - 1;
			int temp = arr[0];
			arr[0] = arr[end];
			arr[end] = temp;
			count--;
		}
	}

	public static void heapSortMaxHeap(int[] arr, int count)
	{
		while (count > 0)
		{
			buildMaxHeap(arr, count);
			int end = count - 1;
			int temp = arr[0];
			arr[0] = arr[end];
			arr[end] = temp;
			count--;
		}
	}

	public static void buildMixHeap(int[] arr, int count)
	{
		int root = (count - 2) / 2;// array index is start from 0, so
									// arr[count-2] is the last second element,
		for (int i = root; i >= 0; i--)
		{
			int parent = i;
			while (2 * parent + 2 <= count)
			{
				int left = 2 * parent + 1;
				int right = 2 * parent + 2;
				int max = left;
				if (right < count && arr[left] > arr[right])
				{
					max = right;
				}
				if (arr[parent] > arr[max])
				{
					int temp = arr[parent];
					arr[parent] = arr[max];
					arr[max] = temp;
				}
				parent = max;
			}
		}
	}

	public static void buildMaxHeap(int[] arr, int count)
	{
		int root = (count - 2) / 2;
		for (int i = root; i >= 0; i--)
		{
			int parent = i;
			int pivot = arr[parent];
			while (2 * parent + 2 <= count)
			{
				int left = 2 * parent + 1;
				int right = 2 * parent + 2;
				int max = left;
				if (right < count && arr[left] < arr[right])
				{
					max = right;
				}
				if (pivot < arr[max])
				{
					arr[parent] = arr[max];
					parent = max;
				} else
				{
					break;
				}
			}
			arr[parent] = pivot;
		}
	}
}
