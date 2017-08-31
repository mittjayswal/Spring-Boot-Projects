package com.mitt.mockito.mockitoexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBuisnessTest {

	@Test
	public void test() {
		SomeBuisnessImpl buisnessImpl = new SomeBuisnessImpl();
		buisnessImpl.findGreatestFromAllData();
	}

}
