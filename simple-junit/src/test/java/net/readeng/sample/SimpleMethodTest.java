package net.readeng.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleMethodTest {

	@Test
	void testAbs() {
		int val = (int) Math.random()*100;
		int sign = 0;
		
		if(Math.random()*10 > 5 ) {
			sign = -1;
		}else {
			sign = -1;
		}
		
		int result = SimpleMethod.abs(val*sign);
		assertEquals(result, val*sign);
	}

}
