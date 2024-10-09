package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import modeloDatos.Auto;
import modeloDatos.Cliente;
import modeloDatos.Pedido;
import util.Constantes;

public class TestAuto {

	private Auto auto;
	private Pedido pedido;
	
	@Before
	public void setUp() throws Exception {
		
		auto = new Auto("azw 638", 3, true);
		
	}

	@Test
	public void testConstructor() {
		
		Assert.assertEquals("azw 638", auto.getPatente());
		Assert.assertEquals(3,auto.getCantidadPlazas());
		Assert.assertTrue(auto.isMascota());

	}
	
	@Test
	public void testGetPuntaje1() {
		
		pedido = new Pedido(new Cliente("jorge", "1234", "Jorge"), 2, true, true, 3, Constantes.ZONA_PELIGROSA);
		Integer x = 80;
		Assert.assertEquals(x,auto.getPuntajePedido(pedido));

	}
	
	@Test
	public void testGetPuntaje2() {
		
		pedido = new Pedido(new Cliente("jorge", "1234", "Jorge"), 2, true, true, 3, Constantes.ZONA_PELIGROSA);
		Integer x = 80;
		Assert.assertEquals(x,auto.getPuntajePedido(pedido));

	}
}
