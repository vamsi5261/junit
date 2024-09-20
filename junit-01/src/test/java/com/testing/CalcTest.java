package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc cal=new Calc();
		assertEquals(2, cal.div(4, 2));
	}

}
