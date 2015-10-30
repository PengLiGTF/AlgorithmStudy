package com.lipeng.algorithm;

public class SelectionSort
{

	public int[] selectionSort(int[] arr)
	{
		int len = arr.length;

		for (int i = 0; i < len; i++)
		{
			int j = i + 1;
			int guard = arr[i];
			for (; j < len; j++)
			{
				if (guard > arr[j])
				{
					int temp = guard;
					guard = arr[j];
					arr[j] = temp;
				}
			}
			arr[i] = guard;
		}
		return arr;

	}

	public int[] selectionSort2(int[] arr)
	{
		int len = arr.length;

		for (int i = 0; i < len; i++)
		{
			int j = i + 1;
			int guard = arr[i];
			int position = i;
			for (; j < len; j++)
			{
				if (guard > arr[j])
				{
					guard = arr[j];
					position = j;
				}
			}
			int temp = arr[i];
			arr[i] = guard;
			arr[position] = temp;
		}
		return arr;

	}

}
