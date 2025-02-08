package com.leetcodeproblems.array;


/*
 
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
import java.util.Arrays;

public class RotateArray 
{
	public static void rotateArray(int nums[],int k)
	{
		int n=nums.length;
		k=k%10;
		
		reverse(nums,0,n-1);
		
		reverse(nums,0,k-1);
		
		reverse(nums,k,n-1);
	}
	
	public static void reverse(int nums[],int start,int end)
	{
		while(start<end)
		{
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int rotate=2;
		System.out.println("\n BEFORE ROTATE: "+Arrays.toString(arr));
		rotateArray(arr,rotate);
		System.out.println("\n AFTER ROTATE: "+Arrays.toString(arr));
		
	}

}
