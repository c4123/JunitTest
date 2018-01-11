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
}