package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import modeloDatos.Administrador;

public class TestAdministrador {

	private Administrador admin;
	
	@Before
	public void setUp() throws Exception {
		admin = null;
	}

	@Test
	public void testGetInstance() {
		
		admin = Administrador.getInstance();
		Assert.assertEquals(null, admin);
		
	}

	@Test
	public void testGetInstance2() {
		
		Administrador adminTest = Administrador.getInstance();		
		Assert.assertEquals(adminTest, admin);
	}
	
	@Test
	public void testConstructor() {
		
		admin = Administrador.getInstance();
		Assert.assertEquals("admin", admin.getNombreUsuario());
		Assert.assertEquals("admin", admin.getPass());
		
	}
}
