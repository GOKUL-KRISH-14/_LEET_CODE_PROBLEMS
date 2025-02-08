package com.leetcodeproblems.array;

import java.util.Arrays;

public class JumpGame
{
	public static boolean jumpGame(int arr[])
	{
		int maxReach=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==maxReach)
			{
				return false;
			}
			
			maxReach=Math.max(maxReach, i+arr[i]);
			
			if(maxReach>=arr.length-1)
			{
				return true;
			}
		}
		return true;
	}
	
	public static int jumpLevel(int arr[])
	{
		int farthestEnd=0;
		int currentEnd=0;
		int jumps=0;
		
		for(int i=0;i<arr.length;i++)
		{
			farthestEnd=Math.max(farthestEnd, i+arr[i]);
			
			if(i==currentEnd)
			{
				jumps++;
				currentEnd=farthestEnd;
			}
			
			if(currentEnd>=arr.length-1)
			{
				break;
			}
		}
		return jumps;
		
	}
	
	public static void main(String args[])
	{
		int arr[]= {2, 3, 1, 1, 4};
		
		boolean booleanResult=jumpGame(arr);
		
		if(booleanResult)
		{
			System.out.println("\nJUMP GAME IS POSSIBLE IS THIS GIVEN ARRAY :"+Arrays.toString(arr));
		}
		else
		{
			System.out.print("JUMP GAME IS NOT POSSIBLE IS THIS GIVEN ARRAY :"+Arrays.toString(arr));
		}
		
		int integerResult=jumpLevel(arr);
		
		System.out.println("\nMINIMUM JUMP TO REACH THE END OF AN GIVEN ARRAY IS: "+integerResult);
	}

}
