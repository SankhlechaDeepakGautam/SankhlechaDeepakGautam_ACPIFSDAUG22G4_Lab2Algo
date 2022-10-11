package com.greatlearning.transaction;

public class Transaction {
   
	public void isTargetAchievable(int target ,int[] arr) {
		
	    int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum >= target) {
				System.out.println("Target achieved after"+" "+(i+1)+" "+"transactions");
				System.out.println();
				break;
			}
		}
		if(sum<target) {
			System.out.println("Given target is not achieved");
			
		}

	}
	
}	