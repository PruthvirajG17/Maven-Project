package com.example.vvce.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
/**
 * Unit test for simple App.
 */
public class AppTest {
	App app=new App();
		void testAdd() {
			assertEquals(25,app.add(20,5));
		}
    @Test
    void testSub() {
    	assertEquals(15,app.sub(20,5));
    }
}
