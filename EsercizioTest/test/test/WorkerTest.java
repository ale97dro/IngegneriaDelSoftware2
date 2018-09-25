package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import application.Worker;

public class WorkerTest 
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
		Worker worker = new Worker(10);
		int expected = 6;
		
		assertEquals(worker.sequence(), expected);
	}
	/*
	@Test 
	public void testSequenceFail()
	{	
		Worker worker = new Worker(2);
		
		assertThrows(Exception.class, () -> { 
			worker.sequence();
			});
	}*/
	
	@Test
	public void testSequenceFail()
	{
		Worker worker = new Worker(2);
		
		assertEquals(worker, new Worker(3));
	}
	
	@Test
	public void testWorkerCreation()
	{
		Worker worker = new Worker(10);
		
		assertEquals(worker, new Worker(10));
	}
	
	
}
