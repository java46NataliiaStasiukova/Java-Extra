package extra.array.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import extra.array.AdditionalTask1;
import extra.array.AdditionalTask2;

class AdditionalTask1Test {

	@Test
	void testTask1_1() {
		int[] arr = {1, 3, 3, 2, 8, 8, 8, 5, 6, 6};
		assertEquals(3, AdditionalTask1.maxSubsequenceLength(arr));
	}
	@Test
	void testTask1_2() {
		int[] arr = {1, 3, 2, 81, 84, 0, 8, 5, 16, 6, -8, 11, 18};
		assertEquals(1, AdditionalTask1.maxSubsequenceLength(arr));
	}
	@Test
	void testTask1_3() {
		int[] arr = {};
		assertEquals(0, AdditionalTask1.maxSubsequenceLength(arr));
	}
	@Test
	void testTask2_1() {
		int num = 7;
		assertEquals(Integer.toBinaryString(num), AdditionalTask2.toBinaryStr(num));
	}
	@Test
	void testTask2_2() {
		int num = 10;
		assertEquals(Integer.toBinaryString(num), AdditionalTask2.toBinaryStr(num));
	}
	@Test
	void testTask2_3() {
		int num = 125;
		assertEquals(Integer.toBinaryString(num), AdditionalTask2.toBinaryStr(num));
	}
	
	
	
	

}
