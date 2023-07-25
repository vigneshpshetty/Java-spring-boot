package com.vignesh.junit;
public class MyMath {
	//{1,2,3}
	
	public int calculateSum(int [] nums) {
		int sum = 0;
		for(int num:nums) {
			sum += num;
		}
		System.out.println();
		return sum;
	}
	

}
