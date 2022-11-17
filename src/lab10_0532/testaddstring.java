package lab10_0532;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		first_class junit = new first_class();
		String result = junit.addstrings("Add", "ition");
		assertEquals("Addition", result);
	}

}
