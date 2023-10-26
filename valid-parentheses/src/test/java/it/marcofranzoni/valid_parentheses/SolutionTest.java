package it.marcofranzoni.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private final Solution validParentheses = new Solution();

	@Test
	public void singleParenthesesShouldReturnTrue() {
		assertTrue(validParentheses.isValid("()"));
	}

	@Test
	public void multipleParenthesesShouldReturnTrue() {
		assertTrue(validParentheses.isValid("()[]{}"));
	}

	@Test
	public void notMatchingParenthesesShouldReturnFalse() {
		assertFalse(validParentheses.isValid("(]"));
	}

	@Test
	public void singleCloseParenthesesShouldReturnFalse() {
		assertFalse(validParentheses.isValid("]"));
	}

	@Test
	public void closeAndOpenParenthesesShouldReturnFalse() {
		assertFalse(validParentheses.isValid("){"));
	}

}