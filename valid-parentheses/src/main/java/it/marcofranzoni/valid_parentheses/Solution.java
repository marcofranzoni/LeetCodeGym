package it.marcofranzoni.valid_parentheses;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {

		if (s.length() < 2) {
			return false;
		}

		Stack<Character> input = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == ')') {
				if (!input.isEmpty()) {
					char lastParentheses = input.pop();
					if (lastParentheses != '(')
						return false;
				} else {
					return false;
				}
			} else if (c == ']') {
				if (!input.isEmpty()) {
					char lastParentheses = input.pop();
					if (lastParentheses != '[')
						return false;
				} else {
					return false;
				}
			} else if (c == '}') {
				if (!input.isEmpty()) {
					char lastParentheses = input.pop();
					if (lastParentheses != '{')
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
