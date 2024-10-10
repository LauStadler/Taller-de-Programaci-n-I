package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import modeloDatos.Chofer;
import modeloDatos.ChoferTemporario;

public class TestChoferTemporario {

	private ChoferTemporario chofer;
	private double sueldobasico = Chofer.getSueldoBasico();
	
	@Before
	public void setUp() throws Exception {
		chofer = new ChoferTemporario("12412512", "Marcus");
	}

	@Test
	public void testSueldoBruto() {
		Assert.assertEquals(Chofer.getSueldoBasico(), chofer.getSueldoBruto(), 0.000001);
	}

	@Test
	public void testSueldoNeto() {
		double sueldoNeto = Chofer.getSueldoBasico() * 0.86;
		Assert.assertEquals(sueldoNeto, chofer.getSueldoNeto(), 0.000001);
	}
	
	
}
