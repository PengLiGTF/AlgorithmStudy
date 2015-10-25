package com.lipeng.algorithm;

import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertSortTest extends TestCase
{

	@Before
	public void beforePrepare()
	{
		// TODO
	}

	@Test
	public void testIsertSort()
	{
		int[] numbers = new int[] { 4, 6, 100, 3, 9, 8, 10, 2, 99, 1, 82, 67 };
		int[] actuals = InsertSort.insertSort2(numbers);
		// int[] actuals = InsertSort.insertSort2(numbers);

		System.out.println(Arrays.toString(actuals));

		int[] expecteds = new int[] { 1, 2, 3, 4, 6, 8, 9, 10, 67, 82, 99, 100 };

		Assert.assertArrayEquals(expecteds, actuals);

	}

	@Test
	public void testIsertSort2()
	{
		int[] numbers = new int[] { 1 };
		int[] actuals = InsertSort.insertSort(numbers);
		System.out.println(Arrays.toString(actuals));
		int[] expecteds = new int[] { 1 };
		Assert.assertArrayEquals(expecteds, actuals);
	}

	@After
	public void after()
	{
		// TODO
	}

}
