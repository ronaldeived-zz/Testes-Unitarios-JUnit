package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	public void teste() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("Erro de comparação" ,1, 1);
		Assert.assertEquals(0.51 , 0.51 , 0.001); // O terceiro é o delta ou seja
		// a margen de erro.
		
		int i = 5;
		Integer i2 = 5;
		
		//Tem que transformar um dos dois para funcionar
		//Porque um é tipo primitivo e o outro é objeto
		Assert.assertEquals(i, i2.intValue());
		Assert.assertEquals(Integer.valueOf(i), i2);
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("bola", "casa");
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		Assert.assertTrue("bola".startsWith("bo"));
		
		
		//Para comparar dois objetos é necessario ir na classe pai
		//e gerar o equals and hash code, para fazer essa verificação 
		//se o nome é igual.
		Usuario us1 = new Usuario();
		Usuario us2 = new Usuario();
		Usuario us3 = null;
		Assert.assertEquals(us1 , us2);
		
		Assert.assertSame(us2,us2);
		
		Assert.assertNull(us3);
	}
}
