package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest 
{
	@Test
	   public void testAdd() {
	      Calculator calculator = new Calculator();
	      assertEquals(30, calculator.add(10, 20));
	   }
	@Test
	   public void testSub() {
	      Calculator calculator = new Calculator();
	      assertEquals(10, calculator.substract(20,10));
	   }
	@Test
	   public void testMul() {
	      Calculator calculator = new Calculator();
	      assertEquals(100, calculator.multiply(10, 10));
	   }
}