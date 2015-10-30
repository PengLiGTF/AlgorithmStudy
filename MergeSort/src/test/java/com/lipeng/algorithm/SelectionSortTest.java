package com.lipeng.algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest
{

	@Test
	public void test()
	{
		int[] arr = new int[] { 3, 4, 2, 1, 6, 7, 5, 9, 888, 777 };
		int[] actuals = new SelectionSort().selectionSort2(arr);

		System.out.println(Arrays.toString(actuals));
		int[] expecteds = new int[] { 1, 2, 3, 4, 5, 6, 7, 9, 777, 888 };
		Assert.assertArrayEquals(expecteds, actuals);

	}

}
