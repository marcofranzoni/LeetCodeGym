package it.marcofranzoni.count_pairs_whose_sum_is_less_than_target;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	public void emptyList() {
		List<Integer> pairs = List.of();
		int result = solution.countPairs(pairs, 0);

		Assertions.assertEquals(0, result);
	}

	@Test
	public void oneElementList() {
		List<Integer> pairs = List.of(1);
		int result = solution.countPairs(pairs, 2);

		Assertions.assertEquals(0, result);
	}

	@Test
	public void onePair() {
		List<Integer> pairs = List.of(0, 1);
		int result = solution.countPairs(pairs, 2);

		Assertions.assertEquals(1, result);
	}

	@Test
	public void noPair() {
		List<Integer> pairs = List.of(0, 1);
		int result = solution.countPairs(pairs, 1);

		Assertions.assertEquals(0, result);
	}

	@Test
	public void threePairs() {
		List<Integer> pairs = List.of(-1, 1, 2, 3, 1);
		int result = solution.countPairs(pairs, 2);

		Assertions.assertEquals(3, result);
	}

	@Test
	public void tenPairs() {
		List<Integer> pairs = List.of(-6, 2, 5, -2, -7, -1, 3);
		int result = solution.countPairs(pairs, -2);

		Assertions.assertEquals(10, result);
	}
}
