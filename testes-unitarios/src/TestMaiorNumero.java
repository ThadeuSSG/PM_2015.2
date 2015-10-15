import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaiorNumero 
{
	@Test
	public void testSimples() throws Exception
	{
		MaiorNumero maior = new MaiorNumero();
		assertEquals(3, maior.pegaMaior(new int[] {1, 2, 3}));
	}

	@Test
	public void testUnico() throws Exception
	{
		MaiorNumero maior = new MaiorNumero();
		assertEquals(1, maior.pegaMaior(new int[] {1}));
	}

	@Test
	public void testOrdem() throws Exception
	{
		MaiorNumero maior = new MaiorNumero();
		assertEquals(3, maior.pegaMaior(new int[] {1, 2, 3}));
		assertEquals(3, maior.pegaMaior(new int[] {3, 1, 2}));
		assertEquals(3, maior.pegaMaior(new int[] {3, 2, 1}));
	}

	@Test
	public void testNegativos() throws Exception
	{
		MaiorNumero maior = new MaiorNumero ();
		assertEquals(-1, maior.pegaMaior(new int[] {-1, -2, -3}));
	}

	@Test
	public void testDuplicados() throws Exception
	{
		MaiorNumero maior = new MaiorNumero ();
		assertEquals(3, maior.pegaMaior(new int[] {3, 1, 2, 3}));
	}

	@Test
	public void testVazio() throws Exception
	{
		try
		{
			MaiorNumero maior = new MaiorNumero();
			maior.pegaMaior (new int[] {});
			fail("Ops! Deveria ter ocorrido uma exce��o");
		}
		catch (Exception e)
		{
			assertTrue(true);
		}
	}
}