package Old;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class WorkerTest //OLD
{
	@Test
	public void testConversionEven()
	{
		int number = 10;
		int expected = 5;
		
		assertEquals(Worker.conversion(number), expected);
	}
	
	@Test
	public void testConversionOdd()
	{
		int number = 9;
		int expected = 28;
		
		assertEquals(Worker.conversion(number), expected);
	}
	
	@Test
	public void testSequence() throws Exception
	{
		int number=10;
		int expected = 6;
		
		assertEquals(Worker.sequence(number), expected);
	}
	
	@Test
	public void testSequenceFail()
	{
		int number = 2;
		
		assertThrows(Exception.class, () -> { 
			Worker.sequence(number);
			});
	}
}
