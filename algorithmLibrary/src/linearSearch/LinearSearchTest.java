package linearSearch;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinearSearchTest {
	final int[] SARCH_TARGET = { 4, 2, 3, 5, 1 };
	int result;

	@Test
	@DisplayName("対象の中に答えが存在する")
	void normalTest() {
		result = LinearSearch.logic(3, SARCH_TARGET);
		System.out.println("normalTestのresult " + result + "\r");
		System.out.println();
		assertThat(result, is(3));
	}

	@Test
	@DisplayName("対象の中に答えが存在しない")
	void irregularTest() {
		result = LinearSearch.logic(-3, SARCH_TARGET);
		System.out.println("irregularTestのresult " + result + "\r");
		assertThat(result, is(-1));
	}

}
