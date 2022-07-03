package task.addTask3.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import task.addTask3.AdditionalTask3;

class AditionalTask3Tests {

	@Test
	void test() {
		String string1 = "HellO";
		String string2 = "oLLeh";
		String string3 = "Helo";
		String string4 = new String("olleh");
		String string5 = "Helo%7";
		assertTrue(AdditionalTask3.isAnagram(string1, string2));
		assertFalse(AdditionalTask3.isAnagram(string1, string1));
		assertFalse(AdditionalTask3.isAnagram(string1, string3));
		assertTrue(AdditionalTask3.isAnagram(string1, string4));
		assertFalse(AdditionalTask3.isAnagram(string1, string5));
	}

}
