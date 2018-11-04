package com.ly.test.hello_world;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_cacol {
	cacol calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("初始化。。。");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc=new cacol();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(Double.valueOf(2),calc.add(1.0,1.0));
	}
	@Test  public void AdditionNegativeNumber() {
        assertEquals(Double.valueOf(0),calc.add(1,-1));
    }    


}
