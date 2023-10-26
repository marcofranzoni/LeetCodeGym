package it.marcofranzoni.valid_parentheses;

import java.util.Map;
import java.util.Stack;

public class Solution {

	private final Map<Character, Character> PARENTHESES = Map.of(')', '(', ']', '[', '}', '{');
	public boolean isValid(String s) {

		if (s.length() < 2) {
			return false;
		}

		Stack<Character> input = new Stack<>();

		for (char c : s.toCharArray()) {
			if (PARENTHESES.containsKey(c)) {
				if (!input.isEmpty()) {
					char lastParentheses = input.pop();
					if (lastParentheses != PARENTHESES.get(c))
						return false;
				} else {
					return false;
				}
			} else {
				input.push(c);
			}

		}

		return input.isEmpty();

	}

}
