import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Frazioni.Frazione;

public class FrazioneTest 
{
	private Frazione a;
	private Frazione b;
	
	@BeforeEach
	private void setup()
	{
		a = new Frazione(1, 4);
		b = new Frazione(1, 2);
	}
	
	@Test
	public void fractionCreationFailTest()
	{
		assertThrows(ArithmeticException.class, () ->{
			Frazione a = new Frazione(1, 0);
			System.out.println(a);
		});
	}
	
	@Test
	public void sumTest()
	{	
		Frazione expected = new Frazione(3, 4);
		Frazione result = a.sum(b);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void subtractionTest()
	{	
		Frazione expected = new Frazione(-1, 4);
		Frazione result = a.subtraction(b);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void multiplyTest()
	{	
		Frazione expected = new Frazione(1, 8);
		Frazione result = a.multiply(b);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void divisionTest()
	{
		Frazione expected = new Frazione(1, 2);
		Frazione result = a.division(b);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void minimizeTest()
	{
		Frazione c = new Frazione (2, 4);
		Frazione d = new Frazione (6, 3);
		Frazione e = new Frazione (9, 6);
		
		assertEquals(new Frazione(1, 2), c.minimize());
		assertEquals(new Frazione(2, 1), d.minimize());
		assertEquals(new Frazione(3, 2), e.minimize());
	}
}
