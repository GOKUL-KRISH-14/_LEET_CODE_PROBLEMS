package com.leetcodeproblems.array;

import java.util.Arrays;

public class MajorityElement 
{
	public static int majorityElement(int arr[])
	{
		Arrays.sort(arr);
		return arr[arr.length/2];
	}
	
	public static int majorElement(int nums[])
	{
		int count=0;
		int candidate=0;
		
		for(int num:nums)
		{
			if(count==0)
			{
				candidate=num;
			}
			count+=(candidate==num)?1:-1;
		}
		return candidate;
	}

	public static void main(String args[])
	{
		int arr[]= {1,1,2,6,7,6,6};
		int result=majorElement(arr);
		System.out.println("\n MAJORITY ELEMENT IS: "+result);
	}

}
