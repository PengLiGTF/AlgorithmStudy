package com.lipeng.algorithm;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest extends TestCase
{
	private MergeSort mergeSort;

	@Override
	public void setUp()
	{
		System.out.println("kkkkkkkkkkkkkkkkk");
		mergeSort = new MergeSort();
	}

	@Test
	public void testMergeSort()
	{
		int[] a = new int[] { 1, 4, 22, 47, 99, 333, 388 };
		int b[] = new int[a.length];

		mergeSort.topDownMergeSort(a, b, a.length - 1);

		int[] expected = new int[] { 1, 4, 22, 47, 99, 333, 388 };

		Assert.assertArrayEquals(expected, a);

	}

}
