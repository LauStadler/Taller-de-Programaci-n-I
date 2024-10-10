package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import modeloDatos.ChoferPermanente;
import modeloDatos.ChoferTemporario;

public class TestChoferPermanente {

	private ChoferPermanente chofer;
	
	@Before
	public void setUp() throws Exception {
		
		chofer = new ChoferPermanente("12412512", "Marcus", 2020, 2);
		
	}

	@Test
	public void testSueldoBruto() {
		Assert.assertEquals(670000, chofer.getSueldoBruto(), 0.000001);
	}

	@Test
	public void testSueldoNeto() {
		Assert.assertEquals(576200, chofer.getSueldoNeto(), 0.000001);  //el assert double esta deprecated buu, se tiene que poner un delta
	}
	
	@Test
	public void testAntiguedad() {
	
		Assert.assertEquals(4, chofer.getAntiguedad());
	}
	
	

}
