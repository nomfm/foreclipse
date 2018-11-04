package com.ly.test.hello_world;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class mulitytest_cacol {
	
	
	private static cacol ca=new cacol();
	
	private int paraw;
	
	private int result;
	
	private int add;
	
	
	@Parameters
	public static Collection data(){
		
		return Arrays.asList(new Object[][]{
			{2,4,4},
			{0,0,0},
			{-3,9,-6}
		});
		
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("初始化变量1");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("初始化变量4");
		
	}

	@Before
	public void setUp() throws Exception {
		
		System.out.println("初始化变量2");
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("初始化变量3");
		
	}
	
	public mulitytest_cacol(int paraw,int result,int add) {
		
		this.paraw=paraw;
		
		this.result=result;
		
		this.add=add;
		
	}

	@Test
	public void test() {
		
		System.out.println("test");
		
		int re=this.ca.square(this.paraw);
		
		assertEquals(result, re);
	}
	@Before
	public void setUp1() throws Exception {
		
		System.out.println("初始化变量22");
		
	}

	@After
	public void tearDown1() throws Exception {
		
		System.out.println("初始化变量33");
		
	}
	@Test 
	public void testadd(){
		
		System.out.println("testadd");
		
		Double re=this.ca.add(this.paraw,this.paraw);
		
		int re1=re.intValue();
		
		assertEquals(add, re1);
	}
	@Ignore("暂不测试该方法")
	
	public void test1(){
		System.out.println("hah");
	}

}
