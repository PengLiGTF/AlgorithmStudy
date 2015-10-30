package com.lipeng.algorithm;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest
{

	@Test
	public void test()
	{

		int[] arr = new int[] { 10, 3, 6, 3, 7, 5, 8, 2, 9, 1 };

		new QuickSort().quickSort(arr, 0, arr.length - 1);

		int[] expecteds = new int[] { 1, 2, 3, 3, 5, 6, 7, 8, 9, 10 };// 10, 3,
		Assert.assertArrayEquals(expecteds, arr);

	}

}
