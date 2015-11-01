package com.lipeng.hill;

import java.util.Arrays;

public class HillSort
{

	public static void main(String[] args)
	{

		int[] arr = new int[] { 80, 30, 60, 60, 40, 20, 10, 50, 70 };
		doHillSort(arr);

		// System.out.println(Arrays.toString(arr));

	}

	public static void doHillSort(int[] arr)
	{
		int len = arr.length;
		for (int d = len / 2; d >= 1;)
		{
			hillSort(arr, d);
			d /= 2;
		}
	}

	public static void hillSort2(int[] arr, int d)
	{
		int len = arr.length;
		for (int i = 0; i + d < len; i++)
		{
			int start = arr[i];
			int endIndex = i + d;
			if (endIndex <= len - 1)
			{
				int end = arr[endIndex];
				if (start > end)
				{
					int temp = start;
					arr[i] = arr[endIndex];
					arr[endIndex] = temp;
				}
			} else
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void hillSort(int[] arr, int d)
	{
		int len = arr.length;
		for (int i = d; i < len; i++)
		{
			int temp = arr[i];
			int j = i - d;
			for (; j >= 0; j -= d)
			{
				i = j + d;
				if (j >= 0 && arr[j] > temp)
				{
					arr[i] = arr[j];
				} else
				{
					break;
				}
			}
			arr[j + d] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
}
