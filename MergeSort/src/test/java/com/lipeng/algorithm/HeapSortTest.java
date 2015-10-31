package com.lipeng.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class HeapSortTest
{

	@Test
	public void test()
	{
		int[] arr = new int[] { 100, 23, 6, 5, 3, 1, 8, 7, 2, 4, 10, 4 };

		int[] expecteds = new int[] { 100, 23, 10, 8, 7, 6, 5, 4, 4, 3, 2, 1 };
		HeapSort.heapSortMinHeap(arr, arr.length);
		Assert.assertArrayEquals(expecteds, arr);

		expecteds = new int[] { 1, 2, 3, 4, 4, 5, 6, 7, 8, 10, 23, 100 };
		HeapSort.heapSortMaxHeap(arr, arr.length);
		Assert.assertArrayEquals(expecteds, arr);

	}

}
