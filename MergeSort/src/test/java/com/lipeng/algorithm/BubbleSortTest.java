package com.lipeng.algorithm;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest
{

	@Test
	public void test()
	{
		int[] arr = new int[] { 2, 3, 1, 7, 5, 9, 6, 4, 8 };
		int[] actuals = new BubbleSort().bubbsort2(arr);
		System.out.println(Arrays.toString(actuals));

		int[] expecteds = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Assert.assertArrayEquals(expecteds, actuals);

	}

}
