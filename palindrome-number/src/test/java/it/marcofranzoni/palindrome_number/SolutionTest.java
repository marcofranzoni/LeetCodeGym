package it.marcofranzoni.palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private final Solution palindromeNumber = new Solution();

	@Test
	public void negativeNumberShouldReturnFalse() {
		assertFalse(palindromeNumber.isPalindrome(-1));
	}

	@Test
	public void singleNumberShouldReturnTrue() {
		assertTrue(palindromeNumber.isPalindrome(1));
	}

	@Test
	public void doubleNumberShouldReturnTrue() {
		assertTrue(palindromeNumber.isPalindrome(11));
	}

	@Test
	public void palindromeNumberShouldReturnTrue() {
		assertTrue(palindromeNumber.isPalindrome(121));
	}

	@Test
	public void palindromeEvenLengthNumberShouldReturnTrue() {
		assertTrue(palindromeNumber.isPalindrome(1221));
	}

	@Test
	public void notPalindromeNumberShouldReturnFalse() {
		assertFalse(palindromeNumber.isPalindrome(12531));
	}

}