package com.lipeng.algorithm;

public class InsertSort
{

	/**
	 * <pre>
	 * for i ← 1 to length(A) - 1
	 *     j ← i
	 *     while j > 0 and A[j-1] > A[j]
	 *         swap A[j] and A[j-1]
	 *         j ← j - 1
	 *     end while
	 * end for
	 * </pre>
	 * 
	 * */
	public static int[] insertSort(int[] numbers)
	{
		int len = numbers.length;
		if (len > 1)
		{
			for (int i = 1; i < len; i++)
			{
				int j = i;
				while (j > 0 && (numbers[j] < numbers[j - 1]))
				{
					int temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
					j--;
				}
			}
		}
		return numbers;
	}

	/**
	 * 
	 * get rid of massive of unnecessary swap
	 * 
	 * */
	public static int[] insertSort2(int[] numbers)
	{
		int len = numbers.length;
		if (len > 1)
		{
			for (int i = 1; i < len; i++)
			{
				int j = i;
				int x = numbers[j];
				while (j > 0 && (x < numbers[j - 1]))
				{
					numbers[j] = numbers[j - 1];
					j--;
				}
				numbers[j] = x;

			}
		}
		return numbers;
	}

}
