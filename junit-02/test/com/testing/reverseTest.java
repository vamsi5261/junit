package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class reverseTest {

	@Test
	public void test() {
		reverse obj=new reverse();
		assertEquals("avaj", obj.rev("java"));
	}

}
