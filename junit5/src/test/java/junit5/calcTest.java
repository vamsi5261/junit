package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;  
@TestInstance(TestInstance.Lifecycle.PER_CLASS)//object will be called once per class
class calcTest {
    calc cal;   
    public calcTest() {//constructor
		System.out.println("Object Called");//every time an object is initialized instead we add @testinstance
	}
    @BeforeAll
    static void beforeAll() {
    	System.out.println("Before All test cases executed");
    }
    @AfterAll
    static void afterAll() {
    	System.out.println("After All test cases executed");
    }
    @BeforeEach
    void beforeEach() {
    	cal=new calc();
		System.out.println("Before Each Test is Executed");
	}
    @Test
	void addtest() {
		assertEquals(4, cal.add(2, 2));
		System.out.println("Test Case1");
	}
	
    @Test
	void subtest() {
		assertEquals(0, cal.sub(2, 2));
		System.out.println("Test Case2");
	}
	@AfterEach
	void afterEach() {
		System.out.println("After Each case is Executed");
	}
}
