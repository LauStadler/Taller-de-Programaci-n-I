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
	
	//Este metodo testea la obtencion del puntaje del auto para un pedido para dos personas, con mascotas y baul, de 3 km y a zona peligrosa
	@Test
	public void testGetPuntaje1() {
		
		pedido = new Pedido(new Cliente("jorge", "1234", "Jorge"), 2, true, true, 3, Constantes.ZONA_PELIGROSA);
		Integer x = 80;
		Assert.assertEquals(x,auto.getPuntajePedido(pedido));

	}
	
	//Este metodo testea la obtencion del puntaje del auto para un pedido para dos personas, con mascotas y sin baul, de 3 km y a zona peligrosa
	@Test
	public void testGetPuntaje2() {
		
		pedido = new Pedido(new Cliente("jorge", "1234", "Jorge"), 2, true, false, 3, Constantes.ZONA_PELIGROSA);
		Integer x = 80;
		Assert.assertEquals(x,auto.getPuntajePedido(pedido));

	}

	//Este metodo testea la obtencion del puntaje del auto para un pedido para 5 personas, con baul y mascotas, de 3 km y a zona peligrosa
	@Test
	public void testGetPuntaje3() {
		
		pedido = new Pedido(new Cliente("jorge", "1234", "Jorge"), 5, true, true, 3, Constantes.ZONA_PELIGROSA);
		Assert.assertEquals(null,auto.getPuntajePedido(pedido));

	}
}
