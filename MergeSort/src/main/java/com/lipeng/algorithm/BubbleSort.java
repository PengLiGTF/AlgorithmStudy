package com.lipeng.algorithm;

public class BubbleSort
{

	public int[] bubbsort(int[] arr)
	{
		int len = arr.length;
		for (int i = 0; i < len; i++)
		{
			for (int j = 1; j < len - i; j++)
			{
				if (arr[j - 1] > arr[j])
				{
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public int[] bubbsort2(int[] arr)
	{
		int len = arr.length;
		boolean swap = false;
		do
		{
			swap = false;
			for (int j = 1; j < len; j++)
			{
				if (arr[j - 1] > arr[j])
				{
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					swap = true;
				}
			}
			len -= 1;

		} while (swap);
		return arr;
	}
}
