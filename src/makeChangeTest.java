import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class makeChangeTest {

	@Test
	void test() {
		TextConverter tc = new TextConverter();
		String input = null;
		String expected = null;
		String output = tc.toCaps(input);
		assertEquals(expected, output);
		fail("Not yet implemented");
	}

}
