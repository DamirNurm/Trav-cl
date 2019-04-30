
*/
package com.sanifrey.test1;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Formula1Test {

	private Formula formula;


	@Before
	public void setup() {

		formula = new Formula();

	}


	@Test

	public void testFormula1() {
	
		assertEquals(formula.getAmount," 0");

	}
}
