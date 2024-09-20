package junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;


class timeoutTest {

	@Test
	void test() {
		timeout t=new timeout();
		int[] unsorted= {};
		assertTimeout(Duration.ofMillis(2), ()->t.array(unsorted));
		//we given a limit of 10millis so its completing the loop within 10millis  and not less than 1 or equal to 1
		//since it took between 2 and 10 that is not less than 1 so for safety we took 10ms.
		//assertTimeout(Duration.ofMillis(0), ()->t.main(null));
	}

}
