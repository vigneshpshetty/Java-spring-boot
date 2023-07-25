package com.vignesh.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath myMath = new MyMath();
	@Test
	void calculateSum_ThreeMemberArray() {
		assertEquals(6,myMath.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void calculateSum_ZeroLengthArray() {
		assertEquals(0, myMath.calculateSum(new int[] {}));
	}

}
