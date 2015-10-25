package com.lipeng.algorithm;

public class InsertSort
{
	public static int[] insertSort(int[] numbers)
	{
		int len = numbers.length;
		if (len > 1)
		{
			int key = numbers[0];
			for (int j = 1; j < len; j++)
			{
				key = numbers[j];
				while (j > 0)
				{
					int preJ = numbers[j - 1];
					if (key < preJ)
					{
						numbers[j] = preJ;
						numbers[--j] = key;
					} else
					{
						break;
					}
				}
			}
		}
		return numbers;
	}
}
