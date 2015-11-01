package com.lipeng.hill;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HillSortTest
{

	@Test
	public void test()
	{
		int[] arr = new int[] { 80, 30, 60, 60, 40, 20, 10, 50, 70 };
		HillSort.doHillSort(arr);
		int[] expecteds = new int[] { 10, 20, 30, 40, 50, 60, 60, 70, 80 };

		Assert.assertArrayEquals(expecteds, arr);

	}

}
