package lab10_0532;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		first_class junit = new first_class();
		int result = junit.addnumbers(100, 200);
		assertEquals(300, result);
	}

}
