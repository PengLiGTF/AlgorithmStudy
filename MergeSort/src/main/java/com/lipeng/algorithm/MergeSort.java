package com.lipeng.algorithm;

/**
 * <pre>
 * 
 * // iBegin is inclusive; iEnd is exclusive (A[iEnd] is not in the set)
 * TopDownSplitMerge(A[], iBegin, iEnd, B[])
 * {
 *     if(iEnd - iBegin < 2)                       // if run size == 1
 *         return;                                 //   consider it sorted
 *     // recursively split runs into two halves until run size == 1,
 *     // then merge them and return back up the call chain
 *     iMiddle = (iEnd + iBegin) / 2;              // iMiddle = mid point
 *     TopDownSplitMerge(A, iBegin,  iMiddle, B);  // split / merge left  half
 *     TopDownSplitMerge(A, iMiddle,    iEnd, B);  // split / merge right half
 *     TopDownMerge(A, iBegin, iMiddle, iEnd, B);  // merge the two half runs
 *     CopyArray(B, iBegin, iEnd, A);              // copy the merged runs back to A
 * }
 * 
 * //  left half is A[iBegin :iMiddle-1]
 * // right half is A[iMiddle:iEnd-1   ]
 * TopDownMerge(A[], iBegin, iMiddle, iEnd, B[])
 * {
 *     i0 = iBegin, i1 = iMiddle;
 *     
 *     // While there are elements in the left or right runs
 *     for (j = iBegin; j < iEnd; j++) {
 *         // If left run head exists and is <= existing right run head.
 *         if (i0 < iMiddle && (i1 >= iEnd || A[i0] <= A[i1])) {
 *             B[j] = A[i0];
 *             i0 = i0 + 1;
 *         } else {
 *             B[j] = A[i1];
 *             i1 = i1 + 1;    
 *         }
 *     } 
 * }
 * 
 * CopyArray(B[], iBegin, iEnd, A[])
 * {
 *     for(k = iBegin; k < iEnd; k++)
 *         A[k] = B[k];
 * }
 * </pre>
 * */

import static java.lang.System.out;

import java.util.Arrays;

public class MergeSort
{

	public static void main(String[] args)
	{
		int[] a = new int[] { 388, 47, 22, 1, 99, 4, 333 };
		int[] b = new int[a.length];
		new MergeSort().topDownMergeSort(a, b, a.length - 1);
		out.println(Arrays.toString(b));
	}

	public void topDownMergeSort(int a[], int b[], int n)
	{
		toDownSplitMerge(a, 0, n, b);
		copyData(a, 0, n, b);

	}

	public void printCurrentSplit(int[] a, int begin, int end)
	{
		for (int i = begin; i <= end; i++)
		{
			out.print(a[i] + ",");
		}
		out.println();
	}

	public void toDownSplitMerge(int a[], int begin, int end, int[] b)
	{

		// printCurrentSplit(a, begin, end);
		if ((end - begin) < 1)
		{
			return;// split until every arr has only elemnt,then the arr
		}
		int middle = (end + begin) / 2;

		toDownSplitMerge(a, begin, middle, b);
		toDownSplitMerge(a, middle + 1, end, b);
		toDownMerge(a, begin, middle, end, b);
		copyData(a, begin, end, b);

	}

	public void toDownMerge(int[] a, int begin, int middle, int end, int[] b)
	{
		int i = begin;
		int j = middle + 1;
		for (int k = begin; k <= end; k++)
		{
			if (i <= middle && (j > end || a[i] <= a[j]))
			{
				b[k] = a[i];
				i++;
			} else
			{
				b[k] = a[j];
				j++;
			}
		}
	}

	public void copyData(int[] a, int begin, int end, int[] b)
	{
		for (int i = begin; i <= end; i++)
		{
			a[i] = b[i];
		}
	}

}
