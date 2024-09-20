package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exceptionTest {

	@Test
	void test() {
		exception exe=new exception();
		int unsorted[]= null;
		assertThrows(NullPointerException.class,()->exe.arr(unsorted));//the test will be passed if array is null
	}

}
